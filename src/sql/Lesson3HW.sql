INSERT INTO ORDERS VALUES(1, 'test1', 500, null, null);
INSERT INTO ORDERS VALUES(2, 'test2', 500, null, null);
INSERT INTO ORDERS VALUES(3, 'test3', 500, null, null);
INSERT INTO ORDERS VALUES(4, 'test4', 500, null, null);
INSERT INTO ORDERS VALUES(5, 'test5', 500, null, null);
INSERT INTO ORDERS VALUES(6, 'test6', 500, null, null);
INSERT INTO ORDERS VALUES(7, 'test7', 500, null, null);
INSERT INTO ORDERS VALUES(8, 'test8', 500, null, null);
INSERT INTO ORDERS VALUES(9, 'test9', 500, null, null);
INSERT INTO ORDERS VALUES(10, 'test10', 500, null, null);

SELECT * FROM ORDERS;

INSERT INTO product VALUES(1001, 'candy', 'test1', 10);
INSERT INTO product VALUES(1002, 't-shirt', 'test1', 20);
INSERT INTO product VALUES(1003, 'candy', 'test2', 30);
INSERT INTO product VALUES(1004, 'toy123', 'test4', 40);
INSERT INTO product VALUES(1005, 'candy', 'someManufacturer', 50);
INSERT INTO product VALUES(1006, 'candy', 'USA', 60);
INSERT INTO product VALUES(1007, 'candy', 'someManufacturer', 70);
INSERT INTO product VALUES(1008, 'candy', 'CHINA', 80);
INSERT INTO product VALUES(1009, 'candy', 'someManufacturer', 90);
INSERT INTO product VALUES(1010, 'candy', 'EUR', 100);

SELECT * FROM product;

SELECT * FROM product WHERE COST_PRICE = 50 AND NAME = 'toy123';
SELECT * FROM product WHERE ID = 1005 AND COST_PRICE < 50;
SELECT * FROM product WHERE ID > 1005 AND manufacture_name = 'someManufacturer';

--DELETE FROM PRODUCT;

UPDATE product SET manufacture_name = 'china' WHERE name = 't-short';

DELETE FROM product WHERE id < 1050;