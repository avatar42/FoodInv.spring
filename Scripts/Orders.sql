CREATE TABLE FoodInv.Orders(id BIGINT NOT NULL primary key auto_increment,
`InvDate`	DATETIME NOT NULL,
`OrderNum`	VARCHAR(13) COMMENT 'len=13',
`OrderDate`	DATETIME,
`Comment`	VARCHAR(494) COMMENT 'len=494');
