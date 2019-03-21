git checkout v1
git pull

docker-compose up -d --build

read -p "Press any key to continue..."

docker stop tp_devops_web_1
docker stop tp_devops_php_1

git checkout v2
git pull

docker-compose up -d --build

docker stop tp_devops_web_1
docker stop tp_devops_php_1

read -p "Press any key to continue..."

git checkout v3
git pull

docker-compose up -d --build

read -p "Press any key to continue..."

docker stop tp_devops_web_1
docker stop tp_devops_php_1
docker stop tp_devops_db_1