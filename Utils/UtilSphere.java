package MineMineNoMi3.Utils;

import java.util.Hashtable;

public class UtilSphere
{
  private static SphereGenerator instance = new SphereGenerator();

  public static void generate(int x0, int y0, int z0, int radius, UtilISphere callback)
  {
    instance.pregenerate(x0, y0, z0, callback, false);
    UtilCircle.generate(x0, z0, radius, instance);
  }

  public static void generateFilled(int x0, int y0, int z0, int radius, UtilISphere callback)
  {
    instance.pregenerate(x0, y0, z0, callback, true);
    UtilCircle.generate(x0, z0, radius, instance); } 
  private static class SphereGenerator implements UtilICircle { private Hashtable<String, Boolean> mTouched = new Hashtable();
    private UtilISphere mCallback;
    private int mX0;
    private int mY0;
    private int mZ0;
    private int mTemp;
    private boolean mFilled;

    public void pregenerate(int x0, int y0, int z0, UtilISphere callback, boolean filled) { this.mX0 = x0;
      this.mY0 = y0;
      this.mZ0 = z0;
      this.mCallback = callback;
      this.mTouched.clear();
      this.mFilled = filled;
    }

    public void call(int x1, int z1)
    {
      this.mTemp = z1;
      UtilCircle.generate(0, this.mY0, x1 - this.mX0, new UtilICircle()
      {
        public void call(int x2, int y2)
        {
          UtilSphere.SphereGenerator.this.updateBlock(UtilSphere.SphereGenerator.this.mX0 + x2, y2, UtilSphere.SphereGenerator.this.mTemp);
        }
      });
      this.mTemp = x1;
      if (this.mFilled)
      {
        UtilCircle.generateFilled(0, this.mY0, z1 - this.mZ0, new UtilICircle()
        {
          public void call(int x2, int y2)
          {
            UtilSphere.SphereGenerator.this.updateBlock(UtilSphere.SphereGenerator.this.mTemp, y2, UtilSphere.SphereGenerator.this.mZ0 + x2);
          }
        });
      }
      else
      {
        UtilCircle.generate(0, this.mY0, z1 - this.mZ0, new UtilICircle()
        {
          public void call(int x2, int y2)
          {
            UtilSphere.SphereGenerator.this.updateBlock(UtilSphere.SphereGenerator.this.mTemp, y2, UtilSphere.SphereGenerator.this.mZ0 + x2);
          }
        });
      }
    }

    private void updateBlock(int x, int y, int z)
    {
      String key = x + " " + y + " " + " " + z;
      if (this.mTouched.containsKey(key))
      {
        return;
      }

      this.mTouched.put(key, Boolean.valueOf(true));

      this.mCallback.call(x, y, z);
    }
  }
}