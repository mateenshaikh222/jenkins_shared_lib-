def call(credentialsId){

    withSonarQubeEnv(credentialsId: SonarQube_API) {
         sh 'mvn clean package sonar:sonar'
    }
}
