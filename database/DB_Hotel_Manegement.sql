create database HotelManagement
go
use HotelManagement

create table tbl_HotelRoom(
	ID_R int primary key,
	Ten_R nvarchar(20),
	Loai_R nvarchar(20),
	SoGiuong_R tinyint,
	Gia_R money
)
go
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(201,N'Phòng T2-201',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(202,N'Phòng T2-202',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(203,N'Phòng T2-203',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(204,N'Phòng T2-204',N'Standard',2,950000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(205,N'Phòng T2-205',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(301,N'Phòng T3-301',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(302,N'Phòng T3-302',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(303,N'Phòng T3-303',N'Standard',2,950000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(304,N'Phòng T3-304',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(305,N'Phòng T3-305',N'Deluxe',1,1200000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(401,N'Phòng T4-401',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(402,N'Phòng T4-402',N'Deluxe',2,1450000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(403,N'Phòng T4-403',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(404,N'Phòng T4-404',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(405,N'Phòng T4-405',N'Suite',2,1850000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(501,N'Phòng T5-501',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(502,N'Phòng T5-502',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(503,N'Phòng T5-503',N'Deluxe',1,1200000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(504,N'Phòng T5-504',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(505,N'Phòng T5-505',N'Superior',2,1100000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(601,N'Phòng T6-601',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(602,N'Phòng T6-602',N'Superior',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(603,N'Phòng T6-603',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(604,N'Phòng T6-604',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(605,N'Phòng T6-605',N'Deluxe',2,1450000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(701,N'Phòng T7-701',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(702,N'Phòng T7-702',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(703,N'Phòng T7-703',N'Standard',1,600000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(704,N'Phòng T7-704',N'Superior',1,800000)
Insert into tbl_HotelRoom(ID_R,Ten_R,Loai_R,SoGiuong_R,Gia_R) values(705,N'Phòng T7-705',N'Superior',2,1100000)

--Khách Hàng
create table tbl_KH(
	ID_KH int primary key,
	Ten_KH nvarchar(20),
	DC_KH nvarchar(30),
	SDT_KH varchar(10),
	CCCD_KH char(12)
)
go
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(2551,N'Hoàng Phương Mai',N'Hà Nội',N'0904864564',152364897235)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(3658,N'Thổ Văn Tả',N'Bắc Giang',N'0906967533',002364887236)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(6854,N'Lý Thất Dạ',N'Kon Tum',N'0904879463',162364852235)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(9587,N'Bùi Minh Đức',N'Thái Bình',N'0904834874',118364895230)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(6300,N'Hoàng Nhật Tân',N'Hà Tĩnh',N'0909854534',150363569831)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(5230,N'Nguyễn Khắc Cháng',N'Hà Nội 2',N'0904898560',102364827235)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(2034,N'Nguyễn Duy Việt',N'Nghệ An',N'0906987251',168424897210)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(6012,N'Trần Duy Chinh',N'Nam Định',N'0902543577',120364897200)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(8024,N'Trần Thị Liên',N'TP Hồ Chí Minh',N'0909685224',152568897230)
Insert into tbl_KH(ID_KH,Ten_KH,DC_KH,SDT_KH,CCCD_KH) values(6482,N'Trần Công Đại',N'Bắc Ninh',N'0906088493',125911587145)
go

--Phòng đã đặt
create table tbl_BookedRoom(
	ID_BK int primary key,
	ID_R int,
	ID_KH int,
	NgayNhan date,
	NgayTra date,
	constraint KN_ID_R_BK foreign key(ID_R) references tbl_HotelRoom(ID_R),
	constraint KN_ID_KH_BK foreign key(ID_KH) references tbl_KH(ID_KH)
)
go
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1001,502,6012,'04/25/2022','04/27/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1002,601,5230,'04/27/2022','04/30/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1003,305,9587,'04/28/2022','04/30/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1004,403,6482,'04/29/2022','04/30/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1005,204,8024,'04/30/2022','05/02/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(1006,404,6012,'04/30/2022','05/05/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(2001,205,6854,'04/30/2022','05/03/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(2002,402,2551,'05/01/2022','05/02/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(2003,304,3658,'05/02/2022','05/04/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(2004,503,2034,'05/05/2022','05/07/2022')
Insert into tbl_BookedRoom(ID_BK,ID_R,ID_KH,NgayNhan,NgayTra) values(2005,701,6300,'05/06/2022','05/10/2022')

go

--Nhân viên
create table tbl_NV(
	ID_NV int primary key,
	Ho_NV nvarchar(20),
	Ten_NV nvarchar(10),
	CCCD_NV char(12),
	ChucVu nvarchar(30),
	Luong money,
	GT nvarchar(10),
	DC_NV nvarchar(30),
	SDT_NV varchar(10)
)
go
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2500,N'Trần Thị Thu',N'Phương',152654896570,N'Quản Lý',7000000,N'Nữ',N'Cà Mau',N'0904474544')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2501,N'Bùi Minh',N'Đức',189642301040,N'Nhân Viên Vệ Sinh',3000000,N'Nam',N'Thái Bình',N'0907372351')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2502,N'Hoàng Nhật',N'Tân',102354145570,N'Lễ Tân',4500000,N'Nữ',N'Hà Tĩnh',N'0907864582')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2503,N'Trần Công',N'Đại',169853400524,N'Quản Lý',7000000,N'Nam',N'Bắc Ninh',N'0903348697')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2504,N'Nguyễn Khắc',N'Cháng',112048965701,N'Giám Đốc',7000000,N'Nam',N'Hà Tây',N'0969630128')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2505,N'Trần Thị Thanh',N'Trúc',139853400478,N'Nhân Viên Dịch Vụ',6000000,N'Nữ',N'Bắc Ninh',N'0905630421')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2506,N'Trần Thị Thanh',N'Vân',169825471520,N'Lễ Tân',4000000,N'Nữ',N'Nghệ An',N'0904821530')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2507,N'Trần Thị',N'Thảo',169858421520,N'Thu Ngân',8000000,N'Nữ',N'Nghệ An',N'0904842350')
Insert into tbl_NV(ID_NV,Ho_NV,Ten_NV,CCCD_NV,ChucVu,Luong,GT,DC_NV,SDT_NV) values(2508,N'Phạm Văn',N'Vân',135245474254,N'Thu Ngân',7500000,N'Nam',N'Nghệ An',N'0904856531')
go

--Hóa đơn
create table tbl_HD(
	ID_HD int primary key,
	ID_BK int,
	ID_NV int,
	Checkin datetime2(0),
	Checkout datetime2(0),
	SoDem tinyint,
	constraint KN_ID_BK_HD foreign key(ID_BK) references tbl_BookedRoom(ID_BK),
	constraint KN_ID_NV_HD foreign key(ID_NV) references tbl_NV(ID_NV)
)
go
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1100,1001,2506,'04/25/2022 13:27','04/27/2022 10:24',2)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1101,1002,2502,'04/27/2022 18:32','04/30/2022 08:58' ,3)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1102,1003,2506,'04/28/2022 15:24','04/30/2022 12:30',2)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1103,1004,2502,'04/29/2022 12:33','04/30/2022 10:24',1)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1104,1005,2502,'04/30/2022 12:21','05/02/2022 07:30',2)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1105,1006,2506,'04/30/2022 12:15','05/05/2022 10:21',5)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1106,2001,2506,'04/30/2022 16:25','05/03/2022 11:15',3)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1107,2002,2502,'05/01/2022 12:10','05/02/2022 12:30',1)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1108,2003,2506,'05/02/2022 19:07','05/04/2022 09:04',2)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1109,2004,2502,'05/05/2022 17:30','05/07/2022 10:24',2)
Insert into tbl_HD(ID_HD,ID_BK,ID_NV,Checkin,Checkout,SoDem) values(1110,2005,2506,'05/06/2022 11:54','05/10/2022 13:30',4)
go

--Dịch vụ
create table tbl_DV(
	ID_DV int primary key,
	Ten_DV nvarchar(30),
	SL_DV tinyint,
	Gia_DV money,
	GhiChu_DV nvarchar(100)
)
go
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0000,N'Không sử dụng dịch vụ',0,N' ')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0001,N'Bể bơi',100000,N'')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0002,N'Spa',500000,N'')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0003,N'Đặt xe',100000,N'Theo yêu cầu của khách hàng')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0004,N'Đặt tiệc',5000000,N'Sự kiện: sinh nhật, cầu hôn, tiệc cưới...')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0005,N'Giặt, ủi quần áo',30000,N'Theo trọng lượng(kg)')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0006,N'Gym',200000,N'Tầng 1 phòng 103')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0007,N'Trông trẻ',500000,N'Đón trẻ từ 8 giờ sáng, trả trẻ lúc 6 giờ tối')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0008,N'Thuê xe tự lái',5000000,N'Khách chỉ được thuê xe khi vẫn đang trong thời gian sử dụng phòng')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0009,N'Đặt vé du lịch',100000,N'Đặt vé và giá vé sẽ thanh toán trong chi tiết hóa đơn')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0010,N'Ăn Sáng',100000,N'')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0011,N'Ăn Trưa',200000,N'')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0012,N'Ăn Tối',200000,N'')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0013,N'Nước uống trong tủ lạnh',30000,N'Chai')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0014,N'Snack',30000,N'Gói')
Insert into tbl_DV(ID_DV,Ten_DV,Gia_DV,GhiChu_DV) values(0015,N'Coffee',30000,N'')
go

-- Chi tiết hóa đơn(dịch vụ)
create table tbl_ChiTietHD_DV(
	ID_HD int not null,
	ID_DV int not null,
	NgayDung datetime2(0),
	SoLuong tinyint,
	GhiChu nvarchar(100),
	DenBu int,
	primary key(ID_HD,ID_DV),
	constraint KN_ID_HD_CT foreign key(ID_HD) references tbl_HD(ID_HD),
	constraint KN_ID_DV_CT foreign key(ID_DV) references tbl_DV(ID_DV)
)
go
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1100,0011,'04/26/2022 06:24',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1100,0005,'04/26/2022 13:39',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1100,0009,'04/27/2022 07:34',3,N'Đặt vé du lịch Sapa',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1101,0000,'04/30/2022 06:58',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1102,0003,'04/28/2022 15:24',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1102,0013,'04/29/2022 10:37',2,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1103,0005,'04/29/2022 17:39',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1103,0014,'04/30/2022 10:30',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1104,0004,'05/01/2022 12:21',1,N' Đặt tiệc cưới',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1104,0012,'05/01/2022 13:30',1,N'  ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1105,0002,'05/01/2022 07:15',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1105,0008,'05/02/2022 13:30',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1106,0007,'04/25/2021 09:10',1,N'Trẻ ngoan, lần sau anh chị đừng cho cháu đến, Vỡ 3 cái bình hoa: 100000',300000)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1107,0003,'05/02/2022 08:34',1,N'Xe mui trần',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1108,0001,'05/03/2022  19:07',1,N' ',0)
Insert into tbl_ChiTietHD_DV(ID_HD,ID_DV,NgayDung,SoLuong,GhiChu,DenBu) values(1110,0006,'05/08/2022 09:34',1,N' ',0)
go