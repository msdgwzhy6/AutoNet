package cn.xiaoxige.autonet_api.interactors;

import java.io.File;

import cn.xiaoxige.autonet_api.base.BaseUsecase;
import cn.xiaoxige.autonet_api.repository.AutoNetRepo;
import io.reactivex.Flowable;

/**
 * @author by zhuxiaoan on 2017/12/12 0012.
 */

public class DoPullStreamPostUsecase extends BaseUsecase {
    private AutoNetRepo mRepo;
    private File mFile;

    public DoPullStreamPostUsecase(AutoNetRepo repo, File file) {
        this.mRepo = repo;
        this.mFile = file;
    }


    @Override
    public Flowable getFlowable() {
        return mRepo.doPullStreamPost(mFile);
    }
}
