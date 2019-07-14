def mvn(servicePath, dragLine) {
    sh 'cd ${servicePath} && mvn -DargLine="${dragLine}"'
}
