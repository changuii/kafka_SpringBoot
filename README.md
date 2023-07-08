# kafka_SpringBoot

Kafka 실습
Spring boot - Kafka 연동 

Producer Server는 사용자로부터 Message를 받아서 Kafka로 send  
Consumer Server는 Kafka exam topic을 listne하다가 message가 들어오면 log로 출력

## 결과
![kafka_test](https://github.com/changuii/kafka_SpringBoot/assets/122252160/bdda0880-350e-4db6-9e46-1dfae26c9bd5)



## kafka


참고 블로그
[원문링크](https://wecandev.tistory.com/100)
[원문링크](https://tommypagy.tistory.com/226)

`kafka-docker` 
- kafka 서버를 doker에 올리기 위한 파일들

`docker-compose 시작`  
``` bash
docker-compose -f docker-compose-single-broker.yml up
```

`create topic`
```bash
kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic tommypagy123
```


## Spring 

참고 블로그
[원문링크](https://victorydntmd.tistory.com/348)




`kafka_springboot_consumer`
- springboot consumer server

`kafka_springboot_producer`
- springboot producer server


