CREATE TABLE accounts (
  `aid` int PRIMARY KEY,
  `aname` varchar(20),
  `acontent` varchar(50)
);

CREATE TABLE users (
  `userid` int PRIMARY KEY,
  `uname` varchar(20),
  `upass` varchar(20)
);