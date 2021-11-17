package cn.edu.pku.sei.srmain;

import cn.edu.pku.sei.common.Global;
import cn.edu.pku.sei.gitparser.DiffExtractor;
import cn.edu.pku.sei.gitparser.GitExtractor;
import cn.edu.pku.sei.smartreview.DoDiffFileCore;
import cn.edu.pku.sei.smartreview.SmartReview;

import java.util.List;

public class OneCommitDecomposition {

    public static void main(String[] args){
        String repo = "C:\\Users\\dell\\IdeaProjects\\TestSR\\.git";
        String commitId = "6f6803395f358236c98cbcf705423d5b898cbd3a";

       GitExtractor t = new GitExtractor(repo);
        List<String> l =  t.getRepoCommitId();
        int count = 0;
        for(String s : l) {
            count++;
        }
        System.out.println(count);

        String outputDir = "F://SR_result";
        String graphDirPath = "F://SR_GraphData/jruby/6f6803395f358236c98cbcf705423d5b898cbd3a";
        DiffExtractor diffExtractor = new DiffExtractor();
        diffExtractor.run(repo,commitId,outputDir,graphDirPath);

    }
}
