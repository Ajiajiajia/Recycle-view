package hrsoft.test_monitor.mvp.contract;

import java.util.List;

import hrsoft.test_monitor.base.BaseContract;

/**
 * @author YangCihang
 * @since 17/10/9.
 * email yangcihang@hrsoft.net
 */

public interface MainContract {
    interface View extends BaseContract.View<MainContract.Presenter> {
        void onDataLoadedSuccess(List<String > models);
    }

    interface Presenter extends BaseContract.Presenter {
        void requestData();
    }
}

