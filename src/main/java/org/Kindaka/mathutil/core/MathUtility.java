/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Kindaka.mathutil.core;

/**
 *
 * @author COMPUTER
 */
//class này clone lại cái class huyền thoại java.util.Math
// với các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()

public class MathUtility {
    public static final double PT = 3.1415;
    
    
    // class này chứa hàm static, chấm xài luôn
    // tính n giai thừa n! = 1.2.3.4....n
    // quy ước thiết kế hàm này như sau
    // 0!=1!=1
    // không có giai thừa số âm. Nếu đưa số âm, CHỬi
    // CHỬI: k trả về giá trị gì ca mà NÉM RA NGOẠI LỆ EXCEPTION
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must between 0...20, plz");
//        if(n == 0 || n == 1)
//            return 1;
//        long product =1 ; // thích nhân dồn khởi động từ 1
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//            
//        return product;
//    }  
        public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must between 0...20, plz");
        if(n == 0 || n == 1)
            return 1;
        return n * getFactorial(n-1);
        
        //công thức đệ quy - recursion
    } 
}
// 5! = 1.2.3.4.5 = 4! * 5 = 5*4!
// 4! = 4 * 3!
//3!  = 3 * 2!
// 2! = 2 * 1!
// 1! = 1 DỪNG Lại

// N! = N * (N-1)!
//------------------------------------------------------------------------
// TDD: Test Driven Development: phát triển phần mềm theo phong cách
// code đến đầu kiểm thử đến đó, viết code và viết test case / test run
// diễn ra xong xong, đan xen

// cứ có hàm là test case
// viết ra các test case đủ bao quát các tình hướng xài hàm
// test case: là một bộ dữ liệu dùng để đưa vào app hàm mô phòng lại
// 1 tình huống xài app/hàm. Nó có input dữ liệu, giải thích cách dùng hàm/ app
// và có giá trị trả về expected
// lát hồi run (test run/ test execution) để luận đúng sai

//DÂN DEV GIỐNG DÂN QC Ở CHỖ NÀY:
// ĐỀU PHẢI VIẾT/TẠO RA TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/ CHẠY TEST
// VÀ ĐỀU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI 
// DEV KHÁC TESTER LÀ PHẢI VIẾT CODE LÀM APP!!!

//TEST CASE k viết tự do mà viết theo template 
// Viết tự do: 0! => 1; 1! => 1; 2! => 2; ....
// Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE, KHÓA LUẬN TỐT NGHIỆP) 
// TEst case #1: (mục tiêu case) check getF() with n = 0
// Steps-Procedures ( cách tiến hành test - input/output...)
//      1. Given n=0
//      2. Call the getF(n) (getF(0))
// Expected results: (Kết quả kỳ vọng)
//      getF(0) must return 1:

// TEst case #2: (mục tiêu case) check getF() with n = 1
// Steps-Procedures ( cách tiến hành test - input/output...)
//      1. Given n=1
//      2. Call the getF(n) (getF(1))
// Expected results: (Kết quả kỳ vọng)
//      getF(1) must return 1: