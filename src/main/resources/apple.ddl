CREATE TABLE APPLE_USER
(
    APPLEID                        VARCHAR(30) NOT NULL,
    PWD                            VARCHAR(30) NOT NULL
)
/
ALTER TABLE APPLE_USER
    ADD(PRIMARY KEY (APPLEID) USING INDEX)
/
CREATE TABLE APPLE_ORDER
(
    ORDERNO                        VARCHAR(20) NOT NULL,
    APPLEID                        VARCHAR(30) NOT NULL,
    STATUS                         CHAR(1) DEFAULT 1 NOT NULL,
    GOODSNAME                      NVARCHAR(10) NOT NULL,
    LASTNAME                       NVARCHAR(2) NOT NULL,
    FIRSTNAME                      NVARCHAR(4) NOT NULL,
    ADDRESS                        NVARCHAR(30) NOT NULL,
    PHONENO                        VARCHAR(13) NOT NULL,
    ORDERDATE                      CHAR(8) NOT NULL,
    SHIPDATE                       CHAR(8),
    ARRIVALDATE                    CHAR(8)
)
/
ALTER TABLE APPLE_ORDER
    ADD(PRIMARY KEY (ORDERNO) USING INDEX)
/
COMMENT ON COLUMN APPLE_ORDER.STATUS IS '订单状态  1:下单 2:已经付款 3:到货 4:出货 5:订单过期 6:订单取消'
/
COMMENT ON COLUMN APPLE_ORDER.GOODSNAME IS '商品名称 iphone3, iphone4_16b, iphone4_32b'
/
COMMENT ON COLUMN APPLE_ORDER.ORDERDATE IS '下单日期'
/
COMMENT ON COLUMN APPLE_ORDER.SHIPDATE IS '出货日期'
/
COMMENT ON COLUMN APPLE_ORDER.ARRIVALDATE IS '到货日期'
/
ALTER TABLE APPLE_ORDER
    ADD(FOREIGN KEY(APPLEID) REFERENCES APPLE_USER (APPLEID))
/
