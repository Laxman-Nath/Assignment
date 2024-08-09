-- SQLite
insert into Publisher
VALUES
(
    null,
    'ABC Publishers',
    'Bhaktapur',
    '9851234345',
    '2010/01/15'
),
(
    null,
    'Samiksha Publications',
    'Kathmandu',
    '9841234345',
    '2005/01/15'
);

insert into Authors
VALUES
(
    null,
    'Parijat',
    'Kathmandu',
    'parijat@gmail.com',
    '1960/12/23',
    'Masters in Philoshopy'
),
(
    null,
    'Suman Pokharel',
    'Kathmandu',
    'suman.pokheral@gmail.com',
    '1960/12/23',
    'Masters in Arts'
),
(
    null,
    'Laxmi Prasad Devkota',
    'Kathmandu',
    'laxmi.dev@gmail.com',
    '1960/12/23',
    'PHD. Literature'
),
(
    null,
    'Banira Giri',
    'Kaski',
    'banira.giri@gmail.com',
    '1960/12/23',
    'Masters in Education'
);


INSERT INTO Book
VALUES
(
    null,
    'मुनामदन',
    '650.50',
    'XZQ5687HGDTE34',
    'Drama',
    '1960/02/23',
    4,
    1
),
(
    null,
    'जीवनको छेउबाट',
    '450.50',
    'EKT5687HGDTE34',
    'Drama',
    '1960/02/23',
    3,
    3
),
(
    null,
    'शिरीषको फूल',
    '1050.25',
    'RGZ5687HGDTE34',
    'Drama',
    '1900/02/23',
    2,
    4
),
(
    null,
    'कारागार',
    '430.25',
    'IOZ5687HGDTE34',
    'Fantasy',
    '2000/02/23',
    2,
    4
),
(
    null,
    'जीवनको छेउबाट',
    '1050.25',
    'RGZ5687HGDTE34',
    'Mystory',
    '1970/02/23',
    3,
    3
);

SELECT * FROM Book;


INSERT INTO Publisher (Name, Address, Phone, Established)
VALUES
('Pearson Education', 'London, UK', '0123456789', '1998-04-15'),
('McGraw-Hill Education', 'New York, NY', '0987654321', '1888-07-17'),
('HarperCollins', 'New York, NY', '0172233445', '1817-12-01'),
('Penguin Random House', 'New York, NY', '0251478963', '2013-07-01'),
('Cambridge University Press', 'Cambridge, UK', '0145678901', '1584-01-01');

INSERT INTO Authors (Name, Address, Email, Dob, Education)
VALUES
('John Smith', 'London, UK', 'johnsmith@example.com', '1980-05-12', 'PhD in Literature'),
('Jane Doe', 'New York, NY', 'janedoe@example.com', '1975-08-25', 'MA in Creative Writing'),
('David Johnson', 'Cambridge, UK', 'davidj@example.com', '1990-03-10', 'BA in English'),
('Emily Davis', 'Toronto, Canada', 'emilydavis@example.com', '1985-12-01', 'MSc in Journalism'),
('Michael Brown', 'Sydney, Australia', 'michaelbrown@example.com', '1978-11-20', 'PhD in Philosophy'),
('Olivia Wilson', 'Auckland, New Zealand', 'oliviawilson@example.com', '1983-07-15', 'MA in History'),
('William Taylor', 'Dublin, Ireland', 'williamtaylor@example.com', '1992-04-22', 'BA in Political Science');



INSERT INTO Book (Title, Price, ISBN, Genre, PublishedDate, AuthorId, PublisherId)
VALUES
('The Great Journey', 19.99, '978-3-16-148410-0', 'Adventure', '2023-05-12', 1, 1),
('Mysteries of the Mind', 24.50, '978-0-262-13472-9', 'Psychology', '2022-08-01', 2, 2),
('History of the Future', 29.95, '978-1-4028-9462-6', 'Science Fiction', '2021-03-14', 3, 3),
('Creative Writing 101', 14.75, '978-0-596-52068-7', 'Education', '2020-11-22', 4, 4),
('Philosophical Insights', 22.30, '978-0-521-85877-2', 'Philosophy', '2019-07-10', 5, 5),
('Tales of Old', 18.99, '978-0-19-852663-6', 'Historical Fiction', '2023-02-05', 6, 1),
('Political Dynamics', 25.00, '978-0-470-08689-9', 'Politics', '2022-09-16', 7, 2),
('Modern Science', 27.50, '978-0-387-95284-7', 'Science', '2021-10-19', 1, 3),
('The Art of Cooking', 15.99, '978-0-7645-7414-7', 'Cooking', '2020-03-30', 2, 4),
('Digital Revolution', 32.20, '978-0-13-110362-7', 'Technology', '2019-11-25', 3, 5),
('The Lost Empire', 19.80, '978-0-345-39180-1', 'Historical Fiction', '2023-01-10', 4, 1),
('Psychology of Success', 24.75, '978-0-07-161469-3', 'Self-help', '2022-04-18', 5, 2),
('Journey to the Stars', 21.40, '978-0-262-53305-3', 'Science Fiction', '2021-07-25', 6, 3),
('The Ancient World', 23.60, '978-0-393-06550-3', 'History', '2020-12-10', 7, 4),
('Culinary Wonders', 17.95, '978-0-14-200067-0', 'Cooking', '2019-05-22', 1, 5),
('The Digital Age', 30.25, '978-0-201-63361-0', 'Technology', '2023-06-14', 2, 1),
('Meditation and Mindfulness', 26.10, '978-0-470-39044-5', 'Self-help', '2022-01-31', 3, 2),
('Exploring the Universe', 28.35, '978-0-521-33520-3', 'Science', '2021-08-07', 4, 3),
('Political Theories', 22.80, '978-0-691-12352-7', 'Politics', '2020-02-13', 5, 4),
('Tales of Tomorrow', 19.90, '978-0-486-28499-0', 'Science Fiction', '2019-09-28', 6, 5);

- 3. Now write prapare following reports:
--      3.1 Get all books which are published in last 30 years
--      3.2 Get total price of books written by parijat
--      3.3 Get all publishers in descending order with number of books published so far
--      3.4 Get all authors with comma seperated list of books they have written

--3.1>.
Select Title,PublishedDate from Book WHERE PublishedDate >= date('now','-30 years');

--3.2>.
SELECT SUM(b.Price) TotalPrice from Book b JOIN Authors a ON
a.Id=b.AuthorId and a.Name='Parijat';

--3.3>.
SELECT p.Name, COUNT(b.ID) PublishedBooks FROM Publisher p JOIN Book b ON p.Id=b.PublisherId GROUP BY p.Name ORDER BY PublishedBooks DESC;

-- 3.4>.
SELECT a.Name Author,GROUP_CONCAT(b.Title,',') Books FROM Authors a JOIN Book b ON 
a.Id=b.PublisherId GROUP BY a.Name;