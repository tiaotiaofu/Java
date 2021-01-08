package 第十二次作业.基合类DOC下发作业;

import java.util.*;

public class set_one {
    static class Book{
        private String index;
        private String name;
        private String price;
        private String publisher;
        public String getIndex() {
            return index;
        }
        public String getName() {
            return name;
        }
        public String getPrice() {
            return price;
        }
        public String getPublisher() {
            return publisher;
        }
        public void setIndex(String index) {
            this.index = index;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPrice(String price) {
            this.price = price;
        }
        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
        public Book(){

        }
        public Book(String index,String name,String price, String publisher){
            this.index = index;
            this.name = name;
            this.price = price;
            this.publisher = publisher;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Map<String,Book> books1 = new HashMap<String,Book>();
        int n;
        String index,name,price,publisher;
        Scanner input = new Scanner(System.in);
        System.out.print("输入书本数量：");
        n = input.nextInt();
        System.out.println("输入图书的编号，名称，单价，出版社");
        for (int i=0;i<n;i++){
            index = input.next();
            name = input.next();
            price = input.next();
            publisher = input.next();
            Book x = new Book(index,name,price,publisher);
            books.add(x);
            books1.put(index,x);
        }
//        通过迭代器访问
        System.out.println("通过链表输出图书信息");
        Iterator it = books.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println("编号："+book.getIndex()+" 名称："+book.getName());
        }
        System.out.println("通过映射输出图书信息");
        Iterator iter = books1.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.println("编号："+entry.getKey() +" 名称："+((Book)entry.getValue()).getName());
        }
    }
}
