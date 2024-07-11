//create abstract class shap with methods calculate area() & calculate valume() Derive two classes sphere(radius) & cone (radius,Height) From it. calculate area & volume of both (use Method overriding)
abstract class Shape 
{
    abstract void calc_area();
    abstract void calc_volume();
}

class Sphere extends Shape 
{
    float r;

    Sphere(float r) 
    {
        this.r = r;
    }

    void calc_area() 
    {
        float a = 4 * 3.14f * r * r;
        System.out.println("Area of sphere=" + a);
    }

    void calc_volume() 
    {
        float v = 4.0f / 3.0f * 3.14f * r * r * r;
        System.out.println("Volume of sphere=" + v);
    }
}

class Cone extends Shape 
{
    float r, h;

    Cone(float r, float h) 
    {
        this.r = r;
        this.h = h;
    }

    void calc_area() 
    {
        float a = 3.14f * r * (r + (float) Math.sqrt(r * r + h * h));
        System.out.println("Area of cone=" + a);
    }

    void calc_volume() 
    {
        float v = 3.14f * r * r * h / 3;
        System.out.println("Volume of cone=" + v);
    }
}

class MD 
{
    public static void main(String[] args) 
    {
        Sphere ob = new Sphere(7.5f);
        ob.calc_area();
        ob.calc_volume();
        Cone ob1 = new Cone(7.2f, 5.6f);
        ob1.calc_area();
        ob1.calc_volume();
    }
}
