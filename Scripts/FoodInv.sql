DROP TABLE IF EXISTS FoodInv.Inv;
DROP TABLE IF EXISTS FoodInv.Orders;
DROP TABLE IF EXISTS FoodInv.Account;
CREATE TABLE FoodInv.Account(id BIGINT NOT NULL primary key auto_increment,
`Email`	VARCHAR(254) COMMENT 'len=254' NOT NULL,
`Name`	VARCHAR(254) COMMENT 'len=254' NOT NULL,
`Password`	VARCHAR(254) COMMENT 'len=254' NOT NULL,
`Userrole`	VARCHAR(25) COMMENT 'len=25' NOT NULL,
CONSTRAINT UC_Email UNIQUE (Email));
INSERT INTO FoodInv.Account (`Email`, `Name`, `Password`, `Userrole`) VALUES ('user@dea42.com', 'user', 'ChangeMe', 'ROLE_USER');
INSERT INTO FoodInv.Account (`Email`, `Name`, `Password`, `Userrole`) VALUES ('admin@dea42.com', 'admin', 'ChangeMe', 'ROLE_ADMIN');
CREATE TABLE FoodInv.Inv(id BIGINT NOT NULL primary key auto_increment,
`Rate`	INTEGER,
`Upc`	VARCHAR(15) COMMENT 'len=15',
`Item`	VARCHAR(46) COMMENT 'len=46' NOT NULL,
`Want`	INTEGER,
`Have`	INTEGER,
`Old`	INTEGER,
`Total`	INTEGER,
`LowInvAdj`	INTEGER,
`GetAlacart`	INTEGER,
`Need`	INTEGER,
`Meal`	VARCHAR(2) COMMENT 'len=2' NOT NULL,
`Subbed`	INTEGER,
`Wanted`	INTEGER,
`Tossed`	INTEGER,
`AvgOrder`	REAL,
`Max`	INTEGER,
`AvgEaten`	REAL,
`Comment`	VARCHAR(50) COMMENT 'len=50');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '=SUM(D3:D18)', 'Breakfast', 75, 47, 0, 47, 0, 0, 28, 'B', null, null, null, null, 28, 27.846153846153847, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321282', 'Apple Strudel Bar', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 1.5, 4, 0.33333333333333331, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321145', 'Banana Nut Muffin', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 4.9393939393939394, 10, 1.96875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674321008', 'Biscotti Bites', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321039', 'Blueberry Lemon Bar', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 1, 1, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674321091', 'Blueberry Muffin - changed', 26, 17, 0, 17, 0, 0, 9, 'B', null, 1, 2, 15.052631578947368, 24, 15.923076923076923, '2 moldy');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674321176', 'Caramel Apple Muffin - DELETED', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 7.333333333333333, 9, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674321022', 'Chewy Chocolate Chip Granola Bar', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674321183', 'Chocolate Biscotti Bites', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674321121', 'Chocolate Frosted Donut', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 8.2, 9, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674321060', 'Cinnamon Bun Bar', 1, 1, 0, 1, 0, 0, 0, 'B', null, null, null, 1.7727272727272727, 6, 0.5, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321084', 'Cinnamon Streusel Muffin', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 2.6666666666666665, 3, 0.21875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321107', 'Double Chocolate Muffin', 20, 12, 0, 12, 0, 0, 8, 'B', null, null, null, 7.6470588235294121, 14, 3.109375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321046', 'Harvest Nut Bar', 28, 17, 0, 17, 0, 0, 11, 'B', null, null, null, 5.5762711864406782, 14, 4.9516129032258061, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674321152', 'Honey Wheat Bagel', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 3, 7, 0.75384615384615383, 'low inv');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674321077', 'Peanut Butter Granola Bar', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 2, 3, 0.063492063492063489, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674321589', 'sweetened Os', 0, 0, 0, 0, 0, 0, 0, 'B', null, null, null, 5, 8, 0.234375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '=SUM(D20:D42)', 'Lunch', 95, 57, 0, 57, 17, 0, 21, 'L', null, null, null, 28.092105263157894, 33, 27.876923076923077, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674581105', 'Arroz con Pollo=deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, 0, null, 15.565217391304348, 21, 3, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581099', 'Bean Bolognese- deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674580665', 'Beans & Ham Soup- deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 1, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581020', 'black beans and rice', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 2, 1.8333333333333333, 4, 0.125, 'Replaced Multigrain Pilaf');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674581037', 'Cheddar Broccoli Rice', 6, 6, 0, 6, 0, 0, 0, 'L', null, null, null, 2.8857142857142857, 8, 1.0952380952380953, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, null, 'Chicken & Beans In Tangy BBQ Sauce', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, null, null, 0.03125, 'new 12/2019. Tastes good but soupy');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674580108', 'Chicken Noodle Soup', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 4, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674855794', 'Chocolate Chip Cookie Dough Bar', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 0, 1, 1, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581419', 'Chocolate Covered Cherry Bar', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 0, 1, 1, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674581426', 'Creamy Beef Alfredo - deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 5.032258064516129, 11, 2.4375, 'Gone 12/29/2019');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674580627', 'Loaded Baked Potato', 6, 6, 0, 6, 0, 0, 0, 'L', null, null, null, 2.1842105263157894, 8, 1.171875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581044', 'Multigrain Pilaf - deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 0, 0, 0, 'discontinued 7/2015');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674581679', 'Mushroom Parmesan Soup With Chicken', 30, 11, 0, 11, 17, 0, 2, 'L', null, null, null, 12.21875, 21, 5.7619047619047619, 'new 12/2019 + 5 alacart May and Jun orders');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674581730', 'Red Beans And Rice With Quinoa', 28, 20, 0, 20, 0, 0, 8, 'L', null, null, null, 13.611111111111111, 29, 11.0625, 'Now Red Beans And Rice With Quinoa');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581013', 'Spicy Kung Pao Noodles', 1, 1, 0, 1, 0, 0, 0, 'L', null, null, 5, 1, 1, 0.015873015873015872, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581112', 'Sweet BBQ pulled Pork', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 0, 0, 0, 'Replaced w/ Sweet bbq sauce with pulled-style pork');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674581198', 'Sweet bbq sauce with pulled-style pork-deleted', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 2.5, 3, 0.24074074074074073, 'Not sure where these came from, not on order');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674580566', 'Three Cheese Chicken', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674580511', 'Tortilla Soup', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, 4, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674580481', 'Chewy Trail Mix Bar', 15, 10, 0, 10, 0, 0, 5, 'L', null, null, null, 3.1153846153846154, 9, 2.2419354838709675, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674580498', 'Tuna Salad=limited', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, 3.68, 7, 0.984375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674580610', 'White Bean Chicken Chili', 9, 3, 0, 3, 0, 0, 6, 'L', null, null, 2, 1.7222222222222223, 4, 0.45, 'Gone 12/29/2019');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, null, 'Garlic Cheese Flatbread', 0, 0, 0, 0, 0, 0, 0, 'L', null, null, null, null, null, 0.031746031746031744, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '=SUM(D44:D76)', 'Dinner', 81, 54, 0, 54, 0, 0, 27, 'D', null, null, null, 27.973684210526315, 28, 28.15625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651051', 'BBQ Seasoned Chicken', 12, 7, 0, 7, 0, 0, 5, 'D', null, null, null, 4.6538461538461542, 7, 1.847457627118644, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651167', 'Chicken & BBQ Beans', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651662', 'Chicken Paella', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 1, 1, 0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651808', 'Beef ''N'' Beans', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 2.25, 3, 0.140625, 'new 12/2019. Tastes good but soupy');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651105', 'Chicken Alfredo', 20, 15, 0, 15, 0, 0, 5, 'D', null, null, null, 6.36231884057971, 11, 6.3692307692307688, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650092', 'Chicken Pasta Parmesan', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651334', 'Fiesta Macaroni And Cheese', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 2.25, 4, 0.046875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651082', 'Grilled Chicken Breast Fillet - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651297', 'Chili with Beans', 1, 1, 0, 1, 0, 0, 0, 'D', null, null, null, 0, 0, -0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674651501', 'Hearty Beef Stew', 0, 0, 0, 0, 0, 0, 0, 'D', null, 3, null, 0, 0, 0, 'exp mar 2017');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674651181', 'Hickory Smoke Flavored Beef Patty - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 9.9318181818181817, 22, 4.28125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674650764', 'Italian Herb Flatbread Pizza - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 2.425, 5, 1.078125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650177', 'Lasagna with Meat Sauce', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674650207', 'Mac & Cheese With Beef', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674651228', 'Mac & Cheese with Turkey Sausage - changed', 21, 14, 0, 14, 0, 0, 7, 'D', null, null, null, 7.7555555555555555, 15, 4.9846153846153847, '1 damaged in 7/30/2020 shipment');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651075', 'Meatballs in Marinara Sauce', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, 1, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651037', 'Meatloaf & Mashed Potatoes', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650238', 'Mushroom Risotto', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, 1, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650252', 'Pasta Fagioli Soup - returned', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674651464', 'Penne Bolognese With Meat Sauce', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 2, 2, 0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650054', 'Ravioli in Meat Sauce', 21, 15, 0, 15, 0, 0, 6, 'D', null, null, null, 5.9090909090909092, 13, 1.676923076923077, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651037', 'Roast Beef & Garlic Mashed Potatoes - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, 1, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674650290', 'Rotini & Meatballs', 2, 1, 0, 1, 0, 0, 1, 'D', null, null, 1, 1.2727272727272727, 3, 0.19047619047619047, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651136', 'Santa Fe Style Chicken', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651150', 'Sesame Ginger Chicken', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 1, 1, 0.046875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674651068', 'Sloppy Joe', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, 'discontinued 7/2015');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674650511', 'Spaghetti with Meat Sauce - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674650344', 'Thick Crust Pizza', 4, 1, 0, 1, 0, 0, 3, 'D', null, null, null, 1.8148148148148149, 3, 0.703125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651020', 'Tuna Casserole', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 1, 1, 0.0625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674650801', 'Turkey & Stuffing - deleted', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 5.8372093023255811, 11, 3.75, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674651143', 'Turkey Sausage & Bacon Rigatoni', 0, 0, 0, 0, 0, 0, 0, 'D', null, 0, null, 7.1379310344827589, 14, 2.859375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651211', 'Tuscan Inspired Pasta', 0, 0, 0, 0, 0, 0, 0, 'D', null, null, null, 1, 1, 0.046875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '=SUM(D78:D110)', 'Snack', 43, 22, 0, 22, 2, null, 19, 'S', null, null, null, 33.1578947368421, 56, 33.261538461538464, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674441553', 'Apple Pecan Bites', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674441683', 'Bacon Ranch Chip', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 5.4, 11, 0.9642857142857143, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441485', 'Carrot Cake', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, 1, 5.3, 9, 0.828125, 'tossed for mold');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674441003', 'Chewy Peanut Bar', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, 1, 3.6875, 8, 0.6875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441089', 'Chocolate Cake', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 11, 11, 0.34375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441010', 'Chocolate Caramel Bar', 8, 0, 0, 0, 0, 0, 8, 'S', null, null, null, 2.875, 5, 0.26153846153846155, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441652', 'Chocolate Cashew Bar', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 1.7142857142857142, 3, 0.22222222222222221, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674440532', 'Chocolate Chip Cookies', 8, 3, 0, 3, 0, 0, 5, 'S', null, null, null, 5.98, 14, 4.4603174603174605, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674440334', 'Chocolatey Nougat Bar-deleted', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 5.2380952380952381, 15, 1.15625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (1, '632674441201', 'Coconut Almond Bar', 1, 1, 0, 1, 0, 0, 0, 'S', null, null, null, 0, 0, -0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674855732', 'Creamy Ranch Snack-A-Rounds - deleted', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 2.8461538461538463, 5, 0.12698412698412698, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674441799', 'Chocolate Brownie bar', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 4.5, 6, 0.19148936170212766, 'available @ HEB');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674441539', 'Dark Chocolate and Sea Salt Nut Bar', 1, 1, 0, 1, 0, 0, 0, 'S', null, null, 1, 0, 0, -0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674441096', 'Fudge Brownie', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 4, 6, 0.09375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674855725', 'Garlic Parmesan Snack-A-Rounds', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 3.75, 6, 0.640625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441072', 'Golden Pound Cake', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 4.5, 5, 0.140625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674440143', 'Honey Mustard Pretzel Bits - changed', 11, 6, 0, 6, 0, 0, 5, 'S', null, null, null, 7.2285714285714286, 14, 3.7230769230769232, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441034', 'Lemon Herb Crisps - deleted', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674440655', 'Nacho Cheese Tortilla Chips - deleted', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674441218', 'Nutrichocolates', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, 3, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441065', 'Oatmeal Chocolate Chunk Cookie-deleted', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 27.23076923076923, 38, 7.4285714285714288, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441157', 'Pumpkin Loaf - limited', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 4.5, 5, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674441232', 'Pizza Puffs', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674855756', 'Salt and Vinegar Snack-A-Rounds', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 2, 2, 0.03125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674855749', 'Smoky BBQ Snack-A-Rounds', 3, 1, 0, 1, 2, 0, 0, 'S', null, null, null, 3.2608695652173911, 10, 1.4615384615384615, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441133', 'Snickerdoodle Cookie - limited', 8, 7, 0, 7, 0, 0, 1, 'S', null, null, null, 2.3103448275862069, 6, 0.73015873015873012, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441669', 'Sweet And Tangy Flavored Meat Stick', 3, 3, 0, 3, 0, 0, 0, 'S', -8, null, null, 10.086956521739131, 18, 8.3818181818181809, '2 extra in box ');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674441676', 'Sweet Jalapeno Chip', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 2.25, 4, 0.32727272727272727, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674440396', 'Thin Mint Crisp Bar', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 2.7333333333333334, 8, 0.28125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674440464', 'Walnut Chocolate Chip Cookies', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674441386', 'White Chocolate Chunk Cookies', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, 1, 2.4, 4, 0.375, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674440297', 'Zesty Herb Snack Mix', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, 1, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674441928', 'Milk Chocolate Flavored Pretzels', 17, 17, 0, 17, 0, 0, 0, 'S', null, null, null, 6.958333333333333, 18, 2.2769230769230768, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '=SUM(D112:D119)', 'Desert', 70, 33, 0, 33, 0, 0, 37, 'S', 8, null, null, 24.098591549295776, 46, 23.21875, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674441744', 'Chocolate Chunk Cookie', 65, 28, 0, 28, 0, 0, 37, 'S', null, null, null, 29.24, 45, 25.4, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441157', 'Pumpkin Loaf - limited', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 4.5, 5, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (2, '632674441560', 'Vanilla Shortbread Cookies', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 3, 4, 0.10714285714285714, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (1, '632674440693', 'White Cheddar Popcorn', 0, 0, 0, 0, 0, 0, 0, 'S', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, '632674441140', 'Toffee Crunch Cookies', 5, 5, 0, 5, 0, 0, 0, 'S', null, null, null, 2.3023255813953489, 9, 1.2769230769230768, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '+D111+D77', 'Snacks+Deserts', 113, 55, 0, 55, 2, 0, 56, 'S', null, null, null, 55.671052631578945, 57, 57, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581679', 'Mushroom Parmesan Soup with Chicken', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 12.21875, 21, 1.625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581396', 'Strawberry Yogurt Flavored Bar', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 4.333333333333333, 8, 0.8125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674901637', 'TurboShake Vanilla (Servings)', 1, 1, 0, 1, 0, 0, 0, 'BA', null, null, null, 7.5, 14, 0.21875, '14 servings in container');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581495', 'White cheddar mac and cheese', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 0, 0, 0, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674651433', 'chicken pasta parmesan', 1, 1, 0, 1, 0, 0, 0, 'DA', null, null, null, 1, 1, 0.061538461538461542, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674651655', 'chilli with beans', 0, 0, 0, 0, 0, 0, 0, 'DA', null, null, null, 0, 0, 0, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674651709', 'lasagna', 1, 0, 0, 0, 0, 0, 1, 'DA', null, null, null, 1, 1, 0.03125, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674651761', 'chicken pot pie', 0, 0, 0, 0, 0, 0, 0, 'DA', null, null, null, 0, 0, 0, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581594', 'spicy kung pao noodles', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 0, 0, 0, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581587', 'black beans and rice', 1, 1, 0, 1, 0, 0, 0, 'LA', null, null, null, 0, 0, -0.032258064516129031, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674854476', 'Chocolate cake mix', 1, 1, 0, 1, 0, 0, 0, 'SA', null, null, null, 2.75, 3, 0.15625, '4 to a box');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674854490', 'Confetti cake mix', 1, 3, 0, 3, 0, 0, 0, 'SA', null, null, null, 1, 1, -0.031746031746031744, '4 to a box');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674321572', 'granola cereal', 1, 1, 0, 1, 0, 0, 0, 'BA', null, null, null, 0, 0, -0.015625, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674321565', 'pancake mix', 1, 1, 0, 1, 0, 0, 0, 'BA', null, null, null, 0, 0, -0.015625, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, null, 'Garlic Cheese Flatbread', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, null, null, 0.03125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674751065', 'Hamburger - frozen', 0, 0, 0, 0, 0, 0, 0, 'F', null, null, null, 9.5384615384615383, 15, 1.9375, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674751072', 'Grilled Chicken Sandwich - frozen', 0, 0, 0, 0, 0, 0, 0, 'F', null, null, null, 9.4615384615384617, 15, 1.9523809523809523, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581624', 'Chocolaty Fudge Graham Bar        ', 2, 2, 0, 2, 0, 0, 0, 'LA', null, null, null, 6.1, 10, 0.921875, 'From sampler');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581549', 'homestyle chicken soup', 1, 1, 0, 1, 0, 0, 0, 'LA', null, null, null, 1.3333333333333333, 2, 0.032258064516129031, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, null, 'Cinnamon Brown Sugar Oat Square', 0, 0, 0, 0, 0, 0, 0, 'BA', null, null, null, null, null, 0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674321657', 'Double Chocolate Muffin', 0, 0, 0, 0, 0, 0, 0, 'BA', null, null, null, 1.6666666666666667, 2, 0.078125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674651839', 'Cheesy Chicken Casserole', 1, 1, 0, 1, 0, 0, 0, 'DA', null, null, null, 1, 1, 0.030769230769230771, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674651846', 'Chicken Edamame Power Bowl', 0, 0, 0, 0, 0, 0, 0, 'DA', null, null, null, 1, 1, 0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674442147', 'Birthday Cake Square', 0, 0, 0, 0, 0, 0, 0, 'DA', null, null, null, 1, 1, 0.015625, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581617', 'Double Chocolate carmel bar', 9, 2, 0, 2, 0, 0, 7, 'LA', null, null, null, 5.2777777777777777, 8, 1.3809523809523809, 'in box of 8');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674580481', 'Chewy Trail Mix Bar', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 3.1153846153846154, 9, 0.578125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (5, null, 'Red Beans And Rice With Quinoa', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, null, null, 0.078125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674651051', 'BBQ Seasoned Chicken', 0, 0, 0, 0, 0, 0, 0, 'DA', null, null, null, 4.6538461538461542, 7, 0.5, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (4, '632674442123', 'Peanut Butter Chocolaty Square', 0, 0, 0, 0, 0, 0, 0, 'SA', null, null, null, 1.8333333333333333, 4, 0.16923076923076924, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, '632674581778', 'Fried Garlic Chicken Flavored Ramen', 0, 0, 0, 0, 0, 0, 0, 'LA', null, null, null, 0, 0, 0, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321046', 'Harvest Nut Bar', 0, 0, 0, 0, 0, 0, 0, 'BA', null, null, null, 5.5762711864406782, 14, 0.28125, null);
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (3, '632674321084', 'Cinnamon Streusel Muffin', 0, 0, 0, 0, 0, 0, 0, 'BA', null, null, null, 2.6666666666666665, 3, 0.484375, '4 to a box');
INSERT INTO FoodInv.Inv (`Rate`, `Upc`, `Item`, `Want`, `Have`, `Old`, `Total`, `LowInvAdj`, `GetAlacart`, `Need`, `Meal`, `Subbed`, `Wanted`, `Tossed`, `AvgOrder`, `Max`, `AvgEaten`, `Comment`) VALUES (null, null, 'Chocolate Chunk Cookie -28', 9, 0, null, 0, null, null, 9, 'SA', null, null, null, null, null, null, null);
CREATE TABLE FoodInv.Orders(id BIGINT NOT NULL primary key auto_increment,
`InvDate`	DATETIME NOT NULL,
`OrderNum`	VARCHAR(13) COMMENT 'len=13',
`OrderDate`	DATETIME,
`Comment`	VARCHAR(494) COMMENT 'len=494');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-05-15 00:00:00.000', '104890460(A)', '2010-05-15 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-06-08 00:00:00.000', '109842500(A)', '2010-06-08 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-07-06 00:00:00.000', '114786299(A)', '2010-07-06 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-08-03 00:00:00.000', '120731426(A)', '2010-08-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-09-07 00:00:00.000', '128315226(A)', '2010-09-07 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-10-12 00:00:00.000', '135583345(A)', '2010-10-12 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-11-16 00:00:00.000', '142150499(A)', '2010-11-16 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2010-12-14 00:00:00.000', '145886649(A)', '2010-12-14 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-01-25 00:00:00.000', '157800711(A)', '2011-01-25 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-03-01 00:00:00.000', '169111566(A)', '2011-03-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-04-05 00:00:00.000', '180455913(A)', '2011-04-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-05-10 00:00:00.000', '189891307(A)', '2011-05-10 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-06-21 00:00:00.000', '199554197(A)', '2011-06-21 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-08-02 00:00:00.000', '209701791(A)', '2011-08-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-09-13 00:00:00.000', '218026307(A)', '2011-09-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-10-25 00:00:00.000', '227002619(A)', '2011-10-25 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2011-12-06 00:00:00.000', '234179204(A)', '2011-12-06 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-01-17 00:00:00.000', '248341846(A)', '2012-01-17 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-02-28 00:00:00.000', '262758963(A)', '2012-02-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-04-10 00:00:00.000', '278567054(A)', '2012-04-10 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-05-15 00:00:00.000', '294681244(A)', '2012-05-15 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-06-19 00:00:00.000', '306978413(A)', '2012-06-19 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-07-24 00:00:00.000', '318386236(A)', '2012-07-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-08-28 00:00:00.000', '329411747(A)', '2012-08-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-10-02 00:00:00.000', '340076495(A)', '2012-10-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-11-13 00:00:00.000', '351910569(A)', '2012-11-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2012-12-25 00:00:00.000', '364163828(A)', '2012-12-25 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-02-05 00:00:00.000', '398699882(A)', '2013-02-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-03-12 00:00:00.000', '417467987(A)', '2013-03-12 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-04-23 00:00:00.000', '438577145(A)', '2013-04-23 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-06-04 00:00:00.000', '454997193(A)', '2013-06-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-07-02 00:00:00.000', '465229712(A)', '2013-07-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-08-13 00:00:00.000', '481392224(A)', '2013-08-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-09-24 00:00:00.000', '495115336(A)', '2013-09-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-11-12 00:00:00.000', '509951942(A)', '2013-11-12 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2013-12-24 00:00:00.000', '518868375(A)', '2013-12-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-02-04 00:00:00.000', '541171027(A)', '2014-02-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-03-04 00:00:00.000', '551500646(A)', '2014-03-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-04-15 00:00:00.000', '563647991(A)', '2014-04-15 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-05-27 00:00:00.000', '577221148(A)', '2014-05-27 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-07-01 00:00:00.000', '585394669(A)', '2014-07-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-08-05 00:00:00.000', '594033223(A)', '2014-08-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-09-02 00:00:00.000', '601571884(A)', '2014-09-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-09-30 00:00:00.000', '608455178(A)', '2014-09-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-10-19 00:00:00.000', '612622114', '2014-10-19 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-11-04 00:00:00.000', '615696068(A)', '2014-11-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-12-02 00:00:00.000', '621331353(A)', '2014-12-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2014-12-30 00:00:00.000', '625445196(A)', '2014-12-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-01-27 00:00:00.000', '635402524(A)', '2015-01-27 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-03-03 00:00:00.000', '646231581(A)', '2015-03-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-03-31 00:00:00.000', '653069555(A)', '2015-03-31 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-04-28 00:00:00.000', '660084951(A)', '2015-04-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-05-26 00:00:00.000', '665379283(A)', '2015-05-26 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-06-23 00:00:00.000', '671622431(A)', '2015-06-23 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-07-21 00:00:00.000', '675977540(A)', '2015-07-21 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-08-18 00:00:00.000', '681005323(A)', '2015-08-18 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-09-15 00:00:00.000', '686184913(A)', '2015-09-15 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-10-13 00:00:00.000', '690637917(A)', '2015-10-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-11-10 00:00:00.000', '696201910(A)', '2015-11-10 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2015-12-08 00:00:00.000', '701060991(A)', '2015-12-08 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-01-05 00:00:00.000', '708302473(A)', '2016-01-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-02-02 00:00:00.000', '720003979(A)', '2016-02-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-03-01 00:00:00.000', '730097950(A)', '2016-03-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-03-29 00:00:00.000', '739957365(A)', '2016-03-29 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-04-26 00:00:00.000', '749585511(A)', '2016-04-26 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-05-24 00:00:00.000', '756943463(A)', '2016-05-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-06-21 00:00:00.000', '764032917(A)', '2016-06-21 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-07-19 00:00:00.000', '769986625(A)', '2016-07-19 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-08-16 00:00:00.000', '776955286(A)', '2016-08-16 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-09-13 00:00:00.000', '783138421(A)', '2016-09-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-10-11 00:00:00.000', '790728213(A)', '2016-10-11 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-11-08 00:00:00.000', '797107647(A)', '2016-11-08 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2016-12-06 00:00:00.000', '802168718(A)', '2016-12-06 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-01-03 00:00:00.000', '808588113(A)', '2017-01-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-01-31 00:00:00.000', '829416721(A)', '2017-01-31 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-02-28 00:00:00.000', '846609594(A)', '2017-02-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-03-28 00:00:00.000', '863031424(A)', '2017-03-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-04-25 00:00:00.000', '875570824(A)', '2017-04-25 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-05-23 00:00:00.000', '886823330(A)', '2017-05-23 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-06-20 00:00:00.000', '896583929(A)', '2017-06-20 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-07-18 00:00:00.000', '904806653(A)', '2017-07-18 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-08-15 00:00:00.000', '914115090(A)', '2017-08-15 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-09-12 00:00:00.000', '924544161(A)', '2017-09-12 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-10-10 00:00:00.000', '933254906(A)', '2017-10-10 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-11-07 00:00:00.000', '941048035(A)', '2017-11-07 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2017-12-05 00:00:00.000', '948349335(A)', '2017-12-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-01-02 00:00:00.000', '956934216(A)', '2018-01-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-01-30 00:00:00.000', '976957365(A)', '2018-01-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-02-27 00:00:00.000', '994403070(A)', '2018-02-27 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-03-27 00:00:00.000', '1010810357(A)', '2018-03-27 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-04-24 00:00:00.000', '1025325516(A)', '2018-04-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-05-24 00:00:00.000', '1043072689(A)', '2018-05-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-06-25 00:00:00.000', '1058300379(A)', '2018-06-25 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-07-24 00:00:00.000', '1070607656(A)', '2018-07-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-08-21 00:00:00.000', '1084695685(A)', '2018-08-21 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-09-20 00:00:00.000', '1098725210(A)', '2018-09-20 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-10-22 00:00:00.000', '1112208808(A)', '2018-10-22 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-11-19 00:00:00.000', '1122157050(A)', '2018-11-19 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2018-12-17 00:00:00.000', '1130341980(A)', '2018-12-17 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-01-14 00:00:00.000', '1145240757(A)', '2019-01-14 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-02-12 00:00:00.000', '1161848003(A)', '2019-02-12 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-03-13 00:00:00.000', '1185682723(A)', '2019-03-13 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-04-10 00:00:00.000', '1210274602(A)', '2019-04-10 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-05-08 00:00:00.000', '1231774515(A)', '2019-05-08 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-06-05 00:00:00.000', '1255461236(A)', '2019-06-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-07-03 00:00:00.000', '1276193445(A)', '2019-07-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-08-04 00:00:00.000', '1301040702(A)', '2019-08-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-09-03 00:00:00.000', '1327661226(A)', '2019-09-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-10-03 00:00:00.000', '1351187582(A)', '2019-10-03 00:00:00.000', '5 extra red beans and rice packets');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-10-31 00:00:00.000', '1372048522(A)', '2019-10-31 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2019-12-01 00:00:00.000', '1390531364(A)', '2019-12-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-01-01 00:00:00.000', '1408334199(A)', '2020-01-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-01-30 00:00:00.000', '1452872510(A)', '2020-01-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-03-02 00:00:00.000', '1493706595(A)', '2020-03-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-04-03 00:00:00.000', '1528083213(A)', '2020-04-03 00:00:00.000', 'A La Carte
Garlic Cheese Flatbread        
2        
$7.00
A La Carte
Mushroom Parmesan Soup with Chicken        
5        
$17.50');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-05-06 00:00:00.000', '1575150097(A)', '2020-05-06 00:00:00.000', 'A La Carte
Mushroom Parmesan Soup with Chicken        
5        
$17.50');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-06-05 00:00:00.000', '1618049999(A)', '2020-06-05 00:00:00.000', 'A La Carte
Mushroom Parmesan Soup with Chicken        
5        
$17.50');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-07-02 00:00:00.000', '1660830678(A)', '2020-07-02 00:00:00.000', 'A La Carte
Mushroom Parmesan Soup with Chicken        
5        
$17.50
A La Carte
Strawberry Yogurt Flavored Bar        
5        
$11.45
A La Carte
Nutrisystem Shaker Bottle        
1        
$9.99
A La Carte
TurboShake Vanilla - 14 Servings        
1        
$39.99');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-07-30 00:00:00.000', '1696148168(A)', '2020-07-30 00:00:00.000', 'A La Carte
Strawberry Yogurt Flavored Bar        
5        
$11.45
A La Carte
Lunch Sandwich Favorites 30-Pack        
1        
$99.99');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-08-28 00:00:00.000', '1737234351(A)', '2020-08-28 00:00:00.000', 'A La Carte
Strawberry Yogurt Flavored Bar        5        $8.59
A La Carte
Fudge Graham Bar        5        $10.31
A La Carte
Trail Mix Bar        5        $10.31');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-09-28 00:00:00.000', '1776626101(A)', '2020-09-28 00:00:00.000', 'A La Carte
Strawberry Yogurt Flavored Bar        8        $18.32
A La Carte
Chocolaty Fudge Graham Bar           6        $16.50
A La Carte
Chicken Pasta Parmesan                  1        $5.49
A La Carte
Chicken Edamame Power Bowl       1        $5.75
A La Carte
Cheesy Chicken Casserole               1        $5.75
A La Carte
Birthday Cake Square        1        $2.75
A La Carte
Double Chocolate Muffin        2        $6.10
A La Carte
Cinnamon Brown Sugar Oat Square        1        $2.25');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-10-29 00:00:00.000', '1816487569(A)', '2020-10-29 00:00:00.000', 'A La Carte
Strawberry Yogurt Flavored Bar        8        $18.32
A La Carte
Chocolate Flavored Pretzels        5        $13.75');
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2020-11-30 00:00:00.000', '1847084294(A)', '2020-11-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-01-05 00:00:00.000', '1883477925(A)', '2021-01-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-02-05 00:00:00.000', '1975539415(A)', '2021-02-05 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-03-04 00:00:00.000', '2041067970(A)', '2021-03-04 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-04-02 00:00:00.000', '2100483923(A)', '2021-04-02 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-05-03 00:00:00.000', '2156855524(A)', '2021-05-03 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-06-01 00:00:00.000', '2210414440(A)', '2021-06-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-07-01 00:00:00.000', '2253974474(A)', '2021-07-01 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-07-30 00:00:00.000', '2293731811(A)', '2021-07-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-08-30 00:00:00.000', '2337783791(A)', '2021-08-30 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-09-28 00:00:00.000', '2385612050(A)', '2021-09-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-10-27 00:00:00.000', '2421936530(A)', '2021-10-27 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-11-24 00:00:00.000', '2452478020(A)', '2021-11-24 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2021-12-22 00:00:00.000', '2476089286(A)', '2021-12-22 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-01-20 00:00:00.000', '2612574909(A)', '2022-01-20 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-02-28 00:00:00.000', '389247727', '2022-02-28 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-03-23 00:00:00.000', '2834169264(A)', '2022-03-23 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-04-20 00:00:00.000', '2920362817(A)', '2022-04-20 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-05-19 00:00:00.000', '3003784146(A)', '2022-05-19 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-06-16 00:00:00.000', '3059422821(A)', '2022-06-16 00:00:00.000', null);
INSERT INTO FoodInv.Orders (`InvDate`, `OrderNum`, `OrderDate`, `Comment`) VALUES ('2022-07-15 00:00:00.000', '3103838300(A)', '2022-07-15 00:00:00.000', null);
