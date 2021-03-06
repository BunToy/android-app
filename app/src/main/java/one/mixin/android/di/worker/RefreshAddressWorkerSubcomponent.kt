package one.mixin.android.di.worker

import dagger.Subcomponent
import dagger.android.AndroidInjector
import one.mixin.android.worker.RefreshAddressWorker

@Subcomponent
interface RefreshAddressWorkerSubcomponent : AndroidInjector<RefreshAddressWorker> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<RefreshAddressWorker>()
}