def call(String ProjectName, String ImageTag, String DockerHubUser) {
  echo 'this is Building the code.'
  sh 'docker build -t ${DockerHubUse}/${ProjectName}:${ImageTag}'
  echo 'docker build successfully.'
}
