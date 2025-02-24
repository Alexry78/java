package lab5;

import java.math.RoundingMode;

public class point3d {  // трехмерный класс точки

    private double xCoord;  // координата x
    private double yCoord;  // координата y
    private double zCoord;  // координата z

    public point3d ( double x, double y, double z){  // конструктор инициализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public  point3d () {  // конструктор по умолчанию
        this(0, 0, 0);
    }
    public double getX () {  // возвращение координаты x
        return xCoord;
    }
    public double getY () {  // возвращение координаты y
        return yCoord;
    }
    public double getZ () {  // возвращение координаты z
        return zCoord;
    }

    public void setX (double val) {  // установка значения координаты x
        xCoord = val;
    }
    public void setY (double val) {  // установка значения координаты y
        yCoord = val;
    }
    public void setZ (double val) {  // установка значения координаты z
        zCoord = val;
    }

    static boolean comparisonxyz(point3d myP1, point3d myP2) {  // сравнение xyz значений двух объектов
        return myP1.getX() == myP2.getX() && myP1.getY() == myP2.getY() && myP1.getZ() == myP2.getZ() ? true: false;
    }

    public double distanceTo(point3d other) {  // вычисление расстояния между точками
        double dx = this.xCoord - other.xCoord;
        double dy = this.yCoord - other.yCoord;
        double dz = this.zCoord - other.zCoord;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}