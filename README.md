# 

## Model
www.msaez.io/#/111743282/storming/93e55621aef16e5cfc7076f172bcdb3a

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- authormanage
- writemanage
- ai
- point
- libraryplatform
- subscribemanage
- outside


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- authormanage
```
 http :8088/authors authorId="authorId"name="name"loginId="loginId"password="password"isApproved="isApproved"portfolioUrl="portfolioUrl"
```
- writemanage
```
 http :8088/writings bookId="bookId"authorId="authorId"authorName="authorName"title="title"context="context"registration="registration"
```
- ai
```
 http :8088/coverDesigns bookId="bookId"authorId="authorId"authorName="authorName"title="title"imageUrl="imageUrl"generatedBy="generatedBy"updatedAt="updatedAt"createdAt="createdAt"
 http :8088/contentAnalyzers bookId="bookId"authorId="authorId"authorName="authorName"context="context"maxLength="maxLength"language="Language"classificationType="classificationType"requestedBy="requestedBy"
```
- point
```
 http :8088/points userId="userId"pointBalance="pointBalance"isKt="isKt"
```
- libraryplatform
```
 http :8088/libraryInfos bookId="bookId"authorId="authorId"authorName="authorName"title="title"imageUrl="imageUrl"summary="summary"context="context"classificationType="classificationType"publishDate="publishDate"selectCount="selectCount"rank="rank"bestseller="bestseller"
```
- subscribemanage
```
 http :8088/users userId="userId"loginId="loginId"loginPassword="loginPassword"name="name"isKt="isKt"isSubscribe="isSubscribe"pointBalance="pointBalance"subscriptionDate="subscriptionDate"
 http :8088/libraries bookId="bookId"title="title"authorName="authorName"imageUrl="imageUrl"summary="summary"
```
- outside
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```
