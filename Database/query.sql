-- SQLite
CREATE TABLE Publisher(
ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
Name TEXT NOT NULL,
Address TEXT NOT NULL,
Phone varchar(10),
Established DATETIME
);

INSERT into Publisher
VALUES
(
null,
'Asmita Publication',
'Kathmandu',
'9864567890',
'2002/12/12'
);

SELECT * from Publisher;
DELETE FROM Publisher where ID=3;

CREATE TABLE Authors(
    Id integer PRIMARY KEY AUTOINCREMENT NOT NULL,
    Name nvarchar(350),
    Address nvarchar(200),
    Email nvarchar(200),
    Dob varchar(100),
    Education varchar(200)
);

INSERT INTO Authors
VALUES 
(
NULL, 
'Tom B. Erichsen', 
 'Norway',
 'tom@gmail.com', 
 '1960/12/23',
 'Master in computer science'
 );

 SELECT * FROM Authors;


CREATE TABLE Book(
ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
Title TEXT NOT NULL,
Price REAL NOT NULL,
ISBN varchar(20) NOT NULL,
Genre TEXT,
PublishedDate DATETIME,
AuthorId INT,
PublisherId INT,
FOREIGN KEY(AuthorId) REFERENCES Author(Id),
FOREIGN KEY(PublisherId) REFERENCES Publisher(Id)
);

INSERT INTO Book
VALUES
(
null,
'Compiler desing',
'900',
'AFGGJHUIUU8',
'CS',
'2018/03/18',
1,
1
);

SELECT * from Book;

// Report on book title,price,author name,publisher name,published data

SELECT b.Title,b.Price,a.Name Author,p.Name Publisher,b.PublishedDate FROM Authors a JOIN Book b JOIN Publisher p ON
a.Id=b.AuthorId and p.ID=b.PublisherId;


