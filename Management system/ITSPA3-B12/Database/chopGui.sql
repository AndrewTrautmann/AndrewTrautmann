DROP DATABASE IF EXISTS chopGui;
CREATE DATABASE chopGui;
USE chopGui;

CREATE TABLE Employee(
empID VARCHAR(40) PRIMARY KEY,
empRole VARCHAR(40),
empName VARCHAR(40),
empSurN VARCHAR(40),
empConNum VARCHAR(12),
empEmail VARCHAR(50)
);

CREATE TABLE Clients(
clientID INT PRIMARY KEY,
clientName VARCHAR(40),
clientContact VARCHAR(40),
clientConNum VARCHAR(12),
clientEmail VARCHAR(45),
vatRegNo VARCHAR(20)
);

CREATE TABLE Project(
projID INT PRIMARY KEY auto_increment,
projName VARCHAR(40),
-- projDesc VARCHAR(255),
projStartDate DATE,
projEndDate DATE,
-- projProofPay TINYINT,
-- projLocation VARCHAR(100),


clientName VARCHAR(40) REFERENCES Clients(clientName),
clientContact VARCHAR(40) REFERENCES Clients(clientContact),
vatRegNo VARCHAR(20) REFERENCES Clients(vatRegNo),
clientConNum VARCHAR(12) REFERENCES Clients(clientConNum),
clientEmail VARCHAR(45) REFERENCES Clients(clientEmail)
-- empID VARCHAR(40) REFERENCES Employee(empID)
);

CREATE TABLE Login(
loginID INT PRIMARY KEY,
userName VARCHAR(50),
pass VARCHAR(50)
);

INSERT INTO Employee(empID,empRole,empName,empSurN,empConNum,empEmail)
VALUES (001, "Admin", "Martin","Oliphant", "0794000966", "martin@test.com"
);

INSERT INTO Project(projName,projStartDate,projEndDate,clientName,clientContact,vatRegNo,clientConNum,clientEmail)
VALUES ( "Sundowns Stadium Restoration","2021/07/18", "2021/08/15","Sundown Stadium","Piet","123456","0714549826","client@gmail.com"
);

INSERT INTO Clients(clientID,clientName,clientContact,clientConNum,vatRegNo,clientEmail)
VALUES (456, "Sundown Stadium", "Piet","0714549826", "123456", "client@gmail.com"
);

INSERT INTO Login(loginID,userName,pass)
VALUES (069, "admin", "123"
);



 -- SELECT * FROM Employee;
 SELECT * FROM Project
-- SELECT * FROM Clients;
-- SELECT  FROM Login;