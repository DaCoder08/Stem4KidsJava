class Shape{
    public int[] sides;
    public Shape(int[] Sides){
        this.sides = Sides;
    }
    public double Perimeter(){
        double p = 0;
        for(int i = 0;i<this.sides.length;i++){
            p += this.sides[i];
        }
        return p;
    }
}
class Rect extends Shape{
    public Rect(int x,int y){
        super(new int[] {x,y,x,y});
    }
    public int Area(){
        return super.sides[0]*super.sides[1];
    }
}
class Triangle extends Shape{
    public int height;
    public Triangle(int a,int b,int c,int height){
        super(new int[] {a,b,c});
        this.height = height;
    }
    public int Area(){
        return (this.sides[2]/2*this.height);
    }
}
public class Classes{
    public static void main(String[] args) {
        Rect myRect = new Rect(4,5);
        System.out.println(myRect.Perimeter()+"\n"+myRect.Area());
        Triangle myTri = new Triangle(5,5,6,4);
        System.out.println(myTri.Perimeter()+"\n"+myTri.Area());
    }
}
