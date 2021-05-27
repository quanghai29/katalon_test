# katalon_test

##Thư mục <bold>Test Cases</bold>
- Được chia theo chức năng
- Có hai chức năng chính cần tập trung Login, SignUp

## Quy định đặt tên
 Tên test case được đặt theo dạng sau:
 		
 		Test_[number test]_[Type Test]
 		
 		Trong đó: 
 			[number test]: thứ tự test case, nếu commit bị trùng tên thì tự tăng number test lên
 			[Type test]: loại test vd Data_CSV, Data_Internal, If_Else, Case
 
 ## Khởi chạy mattermost ở local

   Khởi chạy lần đầu:
   docker run --name mattermost-preview -d --publish 8065:8065 --add-host dockerhost:127.0.0.1 mattermost/mattermost-preview
   
   Tắt
   docker stop mattermost-preview
   
   Khởi chạy từ lần hai
   Mở docker desktop và run image mattermost-preview
   
   TestUI
   http://localhost:8065
   
   TestAPI
   http://localhost:8065/api/v4/system/ping
