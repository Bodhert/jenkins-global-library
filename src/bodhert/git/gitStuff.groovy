package Bodhert.git

def gitCommit(gitPath)
{
    return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().tect
}