create table if not exists api_engine(
app_engine varchar(255) not null,
application varchar(255) null,
service varchar(255) null,
version varchar(255) null,
instance varchar(255) null,
application_request varchar(255) null,
request_params varchar(255) null,
rate_limits Integer null,
application_quota varchar(255) null,
log_manager varchar(255) null,
status varchar(255) null,
constraint api_engine_pk primary key(app_engine));