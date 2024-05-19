# 概要
第8回課題内容は以下の通り。
- テーブルからレコードを全件取得するAPIを実装。
- 全件取得するAPIが実装できたらクエリ文字列を指定して検索するAPIも実装。

Spring Initializr から REST API 作る際、下記を選択した。
- Spring Web
- MySQL Driver
- MyBatis Framework

ディレクトリの構成は、下記の通り。（一部ファイルは省略）
```
├── conf
│ └── mysql
│ └── my.cnf
├── gradlew
├── sql
│ └── 001-create-table-and-load-data.sql
├── src
├── Dockerfile
├── docker-compose.yml
└── build.gradle
```

Dockerfileなどは、第7回課題のハンズオンより拝借。
