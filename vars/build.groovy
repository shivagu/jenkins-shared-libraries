def call(String projectname, String imagetag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${projectname}:${imagetag} ."
}
