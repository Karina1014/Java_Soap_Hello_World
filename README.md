# 🌍 SOAP Hello World Application
## 📖 Project Overview
This project showcases a simple SOAP web service built with Spring Boot. The web service provides a basic Hello World feature using the SOAP protocol.




## 🏁 Setup Instructions
### ⚙️ Requirements
Before running this project, make sure you have Java 17.0.12 (or a compatible version) and Maven installed on your system.
```bash
java -version
mvn -version
```
## ⬇️ Installation Steps

**1.Clone the repository to your local machine**:
1.- Clone the repository
   ```sh
   git clone https://github.com/Karina1014/Java_Soap_Hello_World.git
  ```
2.- Install the required dependencies and build the project:
   ```sh
   mvn clean install
  ```
## ⚙️ Running

1.- Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
  ```
2.- You can test your webhook using Postman or cURL:

**Using Postman:**
- Create a new POST request.
 ```sh
   http://localhost:8080/ws/helloworld.wsdl
 ```
- Set the request headers:

    - Key: Content-Type
    - Value: application/json

- Set the body to raw and select JSON format, then input
```sh
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://example.com/hello-world">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getHelloWorldRequest/>
   </soapenv:Body>
</soapenv:Envelope>
```

# Result




