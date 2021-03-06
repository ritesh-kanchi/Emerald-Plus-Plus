package net.minecraft.world.gen.layer;

public class GenLayerAddSnow extends GenLayer
{
    private static final String __OBFID = "CL_00000553";

    public GenLayerAddSnow(long p_i2121_1_, GenLayer p_i2121_3_)
    {
        super(p_i2121_1_);
        this.parent = p_i2121_3_;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        int i1 = areaX - 1;
        int j1 = areaY - 1;
        int k1 = areaWidth + 2;
        int l1 = areaHeight + 2;
        int[] aint = this.parent.getInts(i1, j1, k1, l1);
        int[] aint1 = IntCache.getIntCache(areaWidth * areaHeight);

        for (int i2 = 0; i2 < areaHeight; ++i2)
        {
            for (int j2 = 0; j2 < areaWidth; ++j2)
            {
                int k2 = aint[j2 + 1 + (i2 + 1) * k1];
                this.initChunkSeed((long)(j2 + areaX), (long)(i2 + areaY));

                if (k2 == 0)
                {
                    aint1[j2 + i2 * areaWidth] = 0;
                }
                else
                {
                    int l2 = this.nextInt(6);
                    byte b0;

                    if (l2 == 0)
                    {
                        b0 = 4;
                    }
                    else if (l2 <= 1)
                    {
                        b0 = 3;
                    }
                    else
                    {
                        b0 = 1;
                    }

                    aint1[j2 + i2 * areaWidth] = b0;
                }
            }
        }

        return aint1;
    }
}