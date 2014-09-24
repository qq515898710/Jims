/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/9/24 ������ 18:54:22                       */
/*==============================================================*/


drop table if exists tb_customer_info;

drop table if exists tb_good_info;

drop table if exists tb_inventory_info;

drop table if exists tb_provider_info;

drop table if exists tb_sell;

drop table if exists tb_sell_return;

drop table if exists tb_stock;

drop table if exists tb_stock_return;

drop table if exists tb_user;

drop table if exists tb_user_log;

drop table if exists tb_user_permission;

drop table if exists tb_user_role;

/*==============================================================*/
/* Table: tb_customer_info                                      */
/*==============================================================*/
create table tb_customer_info
(
   id                   varchar(50) not null comment '�ͻ���ID��ţ����ַ���"c"Ϊ��ŵ�ǰ׺,����4λ��������ŵĺ�׺',
   cname                varchar(50) not null comment '�ͻ�����',
   abbreviation         varchar(50) comment '���',
   address              varchar(100) comment '��ַ',
   postal_code          varchar(50) comment '�������',
   phone                varchar(50) comment '�绰',
   fax                  varchar(50) comment '����',
   contacts             varchar(50) comment '��ϵ��',
   telephone            varchar(50) comment '��ϵ�˵绰',
   email                varchar(50) comment '��������',
   deposit_bank         varchar(60) comment '������',
   account_bank         varchar(60) comment '�ʺ�',
   primary key (id)
);

alter table tb_customer_info comment '�ͻ���Ϣ';

/*==============================================================*/
/* Table: tb_good_info                                          */
/*==============================================================*/
create table tb_good_info
(
   id                   varchar(50) not null comment '��Ʒ�������Ʒ��Ψһ��ʶ��������Ʒ��Ϣ����������������ֲ�ͬ����Ʒ��ǰ׺ʹ�á�g���ַ���',
   gname                varchar(50) not null comment '��Ʒ����',
   abbreviation         varchar(50) comment '���',
   origin               varchar(50) comment '��Ʒ',
   units                varchar(50) comment '��λ',
   pack                 varchar(50) comment '��װ',
   approval_num         varchar(50) comment '��׼�ĺ�',
   batch_num            varchar(50) comment '����',
   memo                 varchar(90) comment '����¼(���)',
   pid                  varchar(50),
   primary key (id)
);

alter table tb_good_info comment '��Ʒ��Ϣ';

/*==============================================================*/
/* Table: tb_inventory_info                                     */
/*==============================================================*/
create table tb_inventory_info
(
   id                   varchar(30) not null comment '���',
   name                 varchar(50) not null comment '��Ʒ����',
   abbreviation         varchar(50) comment '��Ʒ���',
   origin               varchar(50) comment '����',
   specification        varchar(50) comment '���',
   pack                 varchar(50) comment '��װ',
   units                varchar(10) comment '��λ',
   unit_cost            float comment '����',
   amount               int comment '�������',
   primary key (id)
);

alter table tb_inventory_info comment '�����Ϣ';

/*==============================================================*/
/* Table: tb_provider_info                                      */
/*==============================================================*/
create table tb_provider_info
(
   id                   varchar(50) not null comment '��"p"��Ϊǰ׺,����4λ������ŵĺ�׺',
   pname                varchar(60) not null comment '��Ӧ������',
   abbreviation         varchar(50) comment '���',
   address              varchar(100) comment '��ַ',
   postal_code          varchar(50) comment '��������',
   phone                varchar(50) comment '�绰',
   fax                  varchar(50) comment '����',
   contacts             varchar(50) comment '��ϵ��',
   telephone            varchar(50) comment '��ϵ�˵绰',
   deposit_bank         varchar(50) comment '������',
   email                varchar(50) comment '��������',
   primary key (id)
);

alter table tb_provider_info comment '��Ӧ����Ϣ';

/*==============================================================*/
/* Table: tb_sell                                               */
/*==============================================================*/
create table tb_sell
(
   id                   varchar(50) not null comment 'ǰ׺"s",��׺1000��ʽ',
   gid                  varchar(50) comment '��Ʒid',
   cid                  varchar(50) comment '�ͻ�id',
   uid                  varchar(50) comment '����Աid',
   unit_cost            float comment '���۵���',
   amount               int comment '����',
   sum                  float comment '���',
   time                 datetime comment '����ʱ��',
   clearing_form        varchar(50) comment '���㷽ʽ',
   headler              varchar(50),
   primary key (id)
);

alter table tb_sell comment '������Ϣ';

/*==============================================================*/
/* Table: tb_sell_return                                        */
/*==============================================================*/
create table tb_sell_return
(
   id                   varchar(50) not null,
   gid                  varchar(50),
   cid                  varchar(50),
   uid                  varchar(50),
   unit_cost            float,
   amount               int,
   sum                  float,
   time                 datetime,
   clearing_form        varchar(50),
   handler              varchar(50),
   primary key (id)
);

alter table tb_sell_return comment '�����˻���Ϣ';

/*==============================================================*/
/* Table: tb_stock                                              */
/*==============================================================*/
create table tb_stock
(
   id                   varchar(30) not null comment '�����,��"rk"�ַ���Ϊǰ׺,������Ʒ���������,����3λ������Ϊ��׺',
   pid                  varchar(50) comment '��Ӧ��',
   uid                  varchar(50) comment '��Ӧ�û�name�ֶ�',
   gid                  varchar(50),
   variety_amount       int comment 'Ʒ������',
   unit_cost            float comment '����',
   amount               int comment '����',
   sum                  float comment '�ϼƽ��',
   "check"              varchar(50) comment '���ս���',
   time                 datetime comment '���ʱ��',
   clearing_form        varchar(50) comment '���㷽ʽ',
   handler              varchar(50) comment '������',
   primary key (id)
);

alter table tb_stock comment '�����Ϣ��Ҫ����';

/*==============================================================*/
/* Table: tb_stock_return                                       */
/*==============================================================*/
create table tb_stock_return
(
   id                   varchar(30) not null comment '�����,��"rk"�ַ���Ϊǰ׺,������Ʒ���������,����3λ������Ϊ��׺',
   pid                  varchar(50) comment '��Ӧ��',
   gid                  varchar(50),
   uid                  varchar(50) comment '��Ӧ�û�name�ֶ�',
   variety_amount       int comment 'Ʒ������',
   unit_cost            float comment '����',
   amount               int comment '����',
   sum                  float comment '�ϼƽ��',
   "check"              varchar(50) comment '���ս���',
   time                 datetime comment '�˻�ʱ��',
   clearing_form        varchar(50) comment '���㷽ʽ',
   handler              varchar(50) comment '������',
   primary key (id)
);

alter table tb_stock_return comment '�����˻���Ϣ';

/*==============================================================*/
/* Table: tb_user                                               */
/*==============================================================*/
create table tb_user
(
   name                 varchar(50) not null comment '�ʺ�',
   username             varchar(50) not null comment '�û���',
   password             varchar(50) not null comment '����',
   primary key (name)
);

alter table tb_user comment '����Ա��Ϣ';

/*==============================================================*/
/* Table: tb_user_log                                           */
/*==============================================================*/
create table tb_user_log
(
   id                   int not null auto_increment comment '���',
   name                 varchar(50) comment '��Ӧ�û����name',
   time                 datetime comment '��¼ʱ��',
   primary key (id)
);

alter table tb_user_log comment '��¼��־��Ϣ';

/*==============================================================*/
/* Table: tb_user_permission                                    */
/*==============================================================*/
create table tb_user_permission
(
   id                   int not null comment '���',
   rid                  int comment '��Ӧ��ɫ���id',
   KeHuGuanLi           int comment '�ͻ���Ϣ���� ',
   ShangPinGuanLi       int comment '��Ʒ��Ϣ���� ',
   GongYingShangGuanLi  int comment '��Ӧ����Ϣ���� ',
   JinHuoDan            int comment '������ ',
   JinHuoTuiHuo         int comment '�����˻� ',
   XiaoShouDan          int comment ' ���۵� ',
   XiaoShouTuiHuo       int comment ' �����˻� ',
   KeHuChaXun           int comment ' �ͻ���ѯ ',
   ShangPinChaXun       int comment ' ��Ʒ��ѯ ',
   GongYingShangChaXun  int comment ' ��Ӧ�̲�ѯ ',
   XiaoShouChaXun       int comment '���۲�ѯ ',
   XiaoShouTuiHuoChaXun int comment '�����˻���ѯ',
   RuKuChaXun           int comment '�����ѯ',
   RuKuTuiHuoChaXun     int comment '����˻���ѯ',
   XiaoShouPaiHang      int comment '��������',
   KuCunPanDian         int comment '����̵�',
   JiaGeTiaoZheng       int comment '�۸����',
   CaoZuoYuanGuanLi     int comment '����Ա����',
   GengGaiMiMa          int comment '��������',
   QuanXianGuanLi       int comment 'Ȩ�޹���',
   primary key (id)
);

alter table tb_user_permission comment 'Ȩ��';

/*==============================================================*/
/* Table: tb_user_role                                          */
/*==============================================================*/
create table tb_user_role
(
   id                   int not null auto_increment comment '���',
   name                 varchar(50) comment '��Ӧ�û����name',
   type                 int comment '��ɫ����',
   primary key (id)
);

alter table tb_user_role comment '��ɫ';

alter table tb_good_info add constraint FK_Reference_5 foreign key (pid)
      references tb_provider_info (id) on delete restrict on update restrict;

alter table tb_sell add constraint FK_Reference_6 foreign key (gid)
      references tb_good_info (id) on delete restrict on update restrict;

alter table tb_sell add constraint FK_Reference_7 foreign key (cid)
      references tb_customer_info (id) on delete restrict on update restrict;

alter table tb_sell add constraint FK_Reference_8 foreign key (uid)
      references tb_user (name) on delete restrict on update restrict;

alter table tb_sell_return add constraint FK_Reference_10 foreign key (gid)
      references tb_good_info (id) on delete restrict on update restrict;

alter table tb_sell_return add constraint FK_Reference_11 foreign key (cid)
      references tb_customer_info (id) on delete restrict on update restrict;

alter table tb_sell_return add constraint FK_Reference_12 foreign key (uid)
      references tb_user (name) on delete restrict on update restrict;

alter table tb_stock add constraint FK_Reference_13 foreign key (uid)
      references tb_user (name) on delete restrict on update restrict;

alter table tb_stock add constraint FK_Reference_16 foreign key (gid)
      references tb_good_info (id) on delete restrict on update restrict;

alter table tb_stock add constraint FK_Reference_9 foreign key (pid)
      references tb_provider_info (id) on delete restrict on update restrict;

alter table tb_stock_return add constraint FK_Reference_14 foreign key (pid)
      references tb_provider_info (id) on delete restrict on update restrict;

alter table tb_stock_return add constraint FK_Reference_15 foreign key (uid)
      references tb_user (name) on delete restrict on update restrict;

alter table tb_stock_return add constraint FK_Reference_17 foreign key (gid)
      references tb_good_info (id) on delete restrict on update restrict;

alter table tb_user_log add constraint FK_Reference_1 foreign key (name)
      references tb_user (name) on delete restrict on update restrict;

alter table tb_user_permission add constraint FK_Reference_3 foreign key (rid)
      references tb_user_role (id) on delete restrict on update restrict;

alter table tb_user_role add constraint FK_Reference_2 foreign key (name)
      references tb_user (name) on delete restrict on update restrict;

