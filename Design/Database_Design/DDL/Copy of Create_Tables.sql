drop table locality;

drop table city;

drop table country;

drop table brand;

drop table subcategory;

drop table category;

drop table advertisement;

drop table sellerinfo;

drop table users;



create table country(
	country_code varchar(5),
	countryName varchar(50),
	description varchar(50),
	constraint pk_countrycode primary key (country_code)
);

create table city(
	city_code varchar(5),
	country_code varchar(5),
	cityName varchar(50),
	description varchar(50),
	constraint pk_countrycode primary key(country_code,city_code),
	constraint fk_countrycode foreign key(country_code) references country(country_code) on delete cascade
);

create table locality(
	local_code varchar(5),
	country_code varchar(5),
	city_code varchar(5),
	locationName varchar(50),
	description varchar(50),
	constraint pk_localitycode primary key(country_code, city_code, local_code),
	constraint fk_citycode foreign key(country_code,city_code) references city(country_code,city_code) on delete cascade
);

create table Category (
	category_code varchar(20),
	categoryName varchar(50),
	description varchar(50),
	CONSTRAINT pk_categorycode primary key (category_code)
);

create table SubCategory(
	subCategory_code varchar(20),
	Category_code varchar(20),
	description varchar(50) ,
	subCategoryName varchar(50),
	CONSTRAINT pk_subCategorycode primary key (subCategory_code),
	CONSTRAINT fk_categorycode FOREIGN KEY(Category_code) REFERENCES Category(Category_code) on delete cascade
);


create table Brand(
	brandID varchar(50),
	brandName varchar(50) ,
	subCategory_code varchar(20),
	CONSTRAINT pk_brandID primary key (brandID),
	CONSTRAINT fk_subCategoryID FOREIGN KEY (subCategory_code) REFERENCES SubCategory(subCategory_code) on delete cascade
);

create table Users (
	user_id BIGINT AUTO_INCREMENT,
	address varchar(1000) ,
	dob date,
	email varchar(50),
	firstName varchar(30),
	lastName varchar(30),
	gender varchar(6),
	mobileno varchar(20),
	password varchar(30),	
	city varchar(50),
	country varchar(50),
	locality varchar(50),
	cstate varchar(255),
	CONSTRAINT pk_userid primary key(user_id)
);


create table SellerInfo(
	seller_id bigint AUTO_INCREMENT,
	contactName varchar(50),
	email varchar(50),
	mobileNo varchar(20),
	sellerType varchar(30),
	sellingType varchar(10),
	city varchar(50),
	country varchar(50) ,
	locality varchar(50) ,
	cstate varchar(50),
	CONSTRAINT pk_sellerID primary key (seller_id)
);


create table Advertisement (
	advt_id bigint  AUTO_INCREMENT,
	advt_title varchar(200) ,
	category varchar(50),
	subCategory varchar(50),
	brand varchar(50),
	Model varchar(50),
	description varchar(2000) ,
	image varchar(500) ,
	isNegotiable bit ,
	price bigint,	
	validTillDate date ,
	seller_id bigint,
	user_id bigint,
	createdBy varchar(30) ,
	createdDate date,
	CONSTRAINT pk_advtId primary key (advt_id),
	CONSTRAINT FK_SELLER_ID foreign key (seller_id) references SellerInfo(seller_id) on delete cascade,
	CONSTRAINT FK_USER_ID foreign key (user_id) references Users(user_id) on delete cascade
);


commit;
