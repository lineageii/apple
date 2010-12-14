DROP TABLE APPLE_USER;
CREATE TABLE APPLE_USER
(
    APPLEID                        VARCHAR(30) PRIMARY KEY,
    PWD                            VARCHAR(30) NOT NULL
);
DROP TABLE APPLE_ORDER;
CREATE TABLE APPLE_ORDER
(
    ORDERNO                        VARCHAR(20) PRIMARY KEY,
    APPLEID                        VARCHAR(30) NOT NULL,
    STATUS                         CHAR(1) DEFAULT 1 NOT NULL,
    GOODSNAME                      NVARCHAR(10) NOT NULL,
    LASTNAME                       NVARCHAR(10) NOT NULL,
    FIRSTNAME                      NVARCHAR(10) NOT NULL,
    ADDRESS                        NVARCHAR(30) NOT NULL,
    PHONENO                        VARCHAR(13) NOT NULL,
    ORDERDATE                      CHAR(8) NOT NULL,
    SHIPDATE                       CHAR(8),
    ARRIVALDATE                    CHAR(8)
);
COMMENT ON COLUMN APPLE_ORDER.STATUS IS '订单状态  1:下单 2:已经付款 3:到货 4:出货 5:订单过期 6:订单取消';
COMMENT ON COLUMN APPLE_ORDER.GOODSNAME IS '商品名称 iphone3, iphone4_16b, iphone4_32b';
COMMENT ON COLUMN APPLE_ORDER.ORDERDATE IS '下单日期';
COMMENT ON COLUMN APPLE_ORDER.SHIPDATE IS '出货日期';
COMMENT ON COLUMN APPLE_ORDER.ARRIVALDATE IS '到货日期';
ALTER TABLE APPLE_ORDER ADD CONSTRAINT FK_ORDER_USER FOREIGN KEY(APPLEID) REFERENCES APPLE_USER (APPLEID);

insert into APPLE_USER VALUES('hujjg1@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg2@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg3@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg4@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg5@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg6@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg7@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg8@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg9@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg10@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg11@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg12@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg13@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg14@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg15@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg16@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg17@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg18@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg19@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg20@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg21@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg22@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg23@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg24@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg25@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg26@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg27@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg28@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg29@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg30@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg31@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg32@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg33@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg34@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg35@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg36@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg37@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg38@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg39@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg40@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg41@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg42@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg43@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg44@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg45@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg46@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg47@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg48@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg49@eyou.com','pengyan');
insert into APPLE_USER VALUES('hujjg50@eyou.com','pengyan');


