import java.util.Scanner;
//import tương tự include trong C cho phép chúng ta gọi clas,hàm vào file source
public class Main {
    //public: Đây là phạm vi truy cập, ta bắt buộc phải để quyền truy cập ở dạng public để JVM ở bên ngoài có thể truy cập được phương thức và tiến hành thực thi. Nếu sử dụng một phạm vi truy cập khác thì JVM không thể chạy chương trình.(JVM = Java Virtual Machine)
    public static void main(String[] args) {
        //hi chương trình bắt đầu, chưa có đối tượng nào được khởi tạo, vì vậy ta cần để phương thức ở dạng static để JVM có thể load class vào bộ nhớ và có thể gọi phương thức.
        //String[] args: Tham số truyền vào mà một mảng String. args viết tắt của từ arguments. Ta có thể đổi tên cho tham số mà không nhất thiết dùng args
        Scanner scanner = new Scanner(System.in);
        //dùng để đọc dữ liệu bàn phím (thiết bị nhập)
        System.out.print("Nhập tên của bạn: ");
        //dùng để hiện thị dữ liệu được nhập tự người dùng
        String fullName = scanner.nextLine();
        //gán dữ liệu từ bàn phím được nhập vào biến fullName
        String[] nameParts = fullName.split(" ");
        //slpit tiếng Việt là tách, ở đây chúng ta sẽ tách
        //Dòng này chia tên đầy đủ thành các phần riêng biệt dựa trên khoảng trắng và lưu trữ chúng trong một mảng nameParts.
        StringBuilder formattedName = new StringBuilder();
        //class StringBuilder(): Tạo ra một Builder chuỗi với dung lượng ban đầu là 16. ta dùng class này để sử dụng các phương thức append,delete..v..v
        for (String namePart : nameParts) {
            //Dấu ":" được sử dụng để lặp qua các phần tử trong một mảng hoặc một tập hợp (collection). Ví dụ: for (String namePart : nameParts) { ... } sẽ lặp qua mỗi phần tử namePart trong mảng nameParts.
            String chucaidautien = namePart.substring(0, 1).toUpperCase();
            //in hoa chữ cái đầu tiên ở vị trí 0 và kết thúc ở vị trí 1 của từ hiện tại và lưu vào biến chữ cái đầu tiên
            String noichuanoibuon = namePart.substring(1).toLowerCase();
            //viết thường bằng phương thức toLowerCase() từ vị trí 1 trở đi và lưu vào biến nơi chứa nỗi buồn
            formattedName.append(chucaidautien).append(noichuanoibuon).append(" ");
//append là nối ,dòng này nối chữ cái đầu tiên và phần còn lại của từ đã được định dạng viết hoa vào đối tượng formattedName bằng phương thức append(). Một khoảng trắng cũng được thêm vào để tách các từ.
        }

        System.out.println("Tên đã được định dạng viết hoa: " + formattedName.toString().trim());
    }
}