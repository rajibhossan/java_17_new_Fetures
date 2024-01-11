public class RecordClass {

    public static void main(String[] args) {
        MyImporvedRecord record=new MyImporvedRecord(11,10);

        System.out.println(record);
        System.out.println(record.x());
        System.out.println(record.y());

        MyImporvedRecord record2=new MyImporvedRecord(9,9);
        System.out.println(record2);
        System.out.println(record2.x());
        System.out.println(record2.y());

        MyImporvedRecord2 record3=new MyImporvedRecord2();
        System.out.println(record3);
        System.out.println(record3.x());
        System.out.println(record3.y());

    }
}


record MyImporvedRecord(int x, int y){}
record MyImporvedRecord2(int x, int y){
    public MyImporvedRecord2(){
        this(10,10);
    }

    public MyImporvedRecord2(int value){
        this(value,value);
    }
    public MyImporvedRecord2(int x, int y){
        this.x=x;
        this.y=y;
    }

    public MyImporvedRecord2(int x, int y, int z){
        this(x,y+z);
    }
}