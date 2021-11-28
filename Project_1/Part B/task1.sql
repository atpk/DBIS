CREATE TABLE book (
	book_id int,
	title varchar(25),
	category varchar(25),
	author varchar(25),
	PRIMARY KEY (book_id)
);
CREATE TABLE student (
	student_id int,
	name varchar(25),
	dept_name varchar(25),
	year varchar(25),
	semester varchar(25),
	PRIMARY KEY (student_id)
);
CREATE TABLE issue (
	student_id int,
	book_id int,
	issue_date varchar(25),
	return_date varchar(25),
	PRIMARY KEY (student_id, book_id, issue_date),
	FOREIGN KEY (student_id) REFERENCES student(student_id),
	FOREIGN KEY (book_id) REFERENCES book(book_id)
);
