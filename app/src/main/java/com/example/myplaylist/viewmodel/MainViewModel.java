//package com.example.myplaylist.viewmodel;
//
//import android.util.Log;
//
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//import androidx.lifecycle.ViewModelKt;
//import androidx.lifecycle.viewModelScope
//
//import com.example.myplaylist.model.Item;
//import com.example.myplaylist.model.ManiaDBClientResponse;
//import com.example.myplaylist.repository.Repository;
//
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.Iterator;
//import java.util.List;
//
//import kotlin.ResultKt;
//import kotlin.Unit;
//import kotlin.coroutines.Continuation;
//import kotlin.coroutines.CoroutineContext;
//import kotlin.coroutines.intrinsics.IntrinsicsKt;
//import kotlin.coroutines.jvm.internal.Boxing;
//import kotlin.jvm.functions.Function2;
//import kotlin.jvm.internal.Intrinsics;
//import kotlin.text.StringsKt;
//import kotlinx.coroutines.BuildersKt;
//import kotlinx.coroutines.CoroutineStart;
//import retrofit2.Response;
//
//public class MainViewModel extends ViewModel {
//
//    private Repository repository = null;
//
//    public MainViewModel() {
//        this.repository = Repository.Companion.get();
//        this._mySong = new MutableLiveData();
//        this._state = new MutableLiveData();
//        this._state.setValue(true);
//    }
//
//    @NotNull
//    public final MutableLiveData<Boolean> get_state() { return this._state; }
//    @NotNull
//    public final MutableLiveData<List<Item>> get_mySong() { return this._mySong; }
//
//    // 사용자에게 보여줄 국가 MutableLiveData
//    public MutableLiveData<List<Item>> _mySong = new MutableLiveData<>();
//
//    // 로딩 중인지를 나타내는 MutableLiveData
//    public MutableLiveData<Boolean> _state = new MutableLiveData<>();
//
//
////    // 레트로핏 객체를 싱글톤으로 가져옴
////    public CountriesService countriesService = CountriesService.getInstance();
////
////    private final CompositeDisposable disposable = new CompositeDisposable();
////
//
//    public final void getSong(@NotNull final String keyword) {
//        this._state.setValue(false);
//        BuildersKt.launch(ViewModelKt.getViewModelScope(this), null, null, (new Function2(null) {
//            int label;
//
//            @Nullable
//            public final Object invokeSuspend(@NotNull Object $result) {
//                Object var8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
//                Object var10000;
//                switch(this.label) {
//                    case 0:
//                        ResultKt.throwOnFailure($result);
//                        Repository var9 = MainViewModel.this.repository;
//                        String var10001 = keyword;
//                        this.label = 1;
//                        var10000 = var9.getSong(var10001, this);
//                        if (var10000 == var8) {
//                            return var8;
//                        }
//                        break;
//                    case 1:
//                        ResultKt.throwOnFailure($result);
//                        var10000 = $result;
//                        break;
//                    default:
//                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
//                }
//
//                Object var2 = var10000;
//                Response response = (Response)var2;
//                int var4 = false;
//                if (response.isSuccessful()) {
//                    var10000 = response.body();
//                    Intrinsics.checkNotNull(var10000);
//                    Channel var10 = ((ManiaDBClientResponse)var10000).getChannel();
//                    Intrinsics.checkNotNull(var10);
//                    List list = var10.getItemList();
//                    if (list != null) {
//                        Iterator var6 = list.iterator();
//
//                        while(var6.hasNext()) {
//                            Item i = (Item)var6.next();
//                            i.setTitle(StringsKt.replace$default(i.getTitle(), "&nbsp;", " ", false, 4, (Object)null));
//                        }
//                    }
//
//                    MainViewModel.this._mySong.setValue(list);
//                } else {
//                    Log.d("tst5", "getSong: " + response.code());
//                }
//
//                MainViewModel.this._state.setValue(Boxing.boxBoolean(true));
//                return Unit.INSTANCE;
//            }
//
//            @NotNull
//            public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
//                Intrinsics.checkNotNullParameter(completion, "completion");
//                Function2 var3 = new <anonymous constructor>(completion);
//                return var3;
//            }
//
//            public final Object invoke(Object var1, Object var2) {
//                return ((<undefinedtype>)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
//            }
//        }), 3, (Object)null);
//    }
//
//
//}
