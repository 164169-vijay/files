var fs=require('fs');
var readMe=fs.readFileSync('read.txt','utf8');
fs.writeFileSync('writeMe.txt',readMe);  