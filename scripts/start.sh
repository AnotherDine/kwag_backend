PROJECT_ROOT="/home/ubuntu/app"
JAR_FILE_NAME="back-0.0.1-SNAPSHOT.jar"
JAR_FILE="$PROJECT_ROOT/back-0.0.1-SNAPSHOT.jar"
ARG_OPTION="--spring.profiles.active=prod"

APP_LOG="$PROJECT_ROOT/application.log"
ERROR_LOG="$PROJECT_ROOT/error.log"
DEPLOY_LOG="$PROJECT_ROOT/deploy.log"

TIME_NOW=$(date +%c)

# build 파일 복사
echo "$TIME_NOW > $JAR_FILE 파일 복사" >> $DEPLOY_LOG
cp $PROJECT_ROOT/build/libs/$JAR_FILE_NAME $JAR_FILE

# jar 파일 실행
echo "$TIME_NOW > $JAR_FILE 파일 실행" >> $DEPLOY_LOG
source ~/.bashrc
nohup java -jar $JAR_FILE $ARG_OPTION > $APP_LOG 2> $ERROR_LOG &

CURRENT_PID=$(pgrep -f $JAR_FILE)
echo "$TIME_NOW > 실행된 프로세스 아이디 $CURRENT_PID 입니다." >> $DEPLOY_LOG