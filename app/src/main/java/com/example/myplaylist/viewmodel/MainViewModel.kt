package com.example.myplaylist.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.dx.rop.cst.Constant
import com.example.myplaylist.model.Item
import com.example.myplaylist.repository.Repository
import com.example.myplaylist.util.TAG

import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {

    private val repository = Repository.get()

    private val _mySong : MutableLiveData<List<Item>> = MutableLiveData()
    val mySong: LiveData<List<Item>> get() = _mySong

    private var _state : MutableLiveData<Boolean> = MutableLiveData()
    val state : LiveData<Boolean> get() = _state

    init {
        _state.value = true
    }

    fun getSong(keyword: String){
        _state.value = false // 로딩
        viewModelScope.launch { repository.getSong(keyword).let { response ->
                if(response.isSuccessful){
                    val list = response.body()!!.channel!!.itemList
                    if (list != null) {
                        // 결과값 &nbsp; 제거
                        for(i in list){
                            i.title = i.title.replace("&nbsp;"," ")
                        }
                    }
                    _mySong.value = list
                }
                else{
                    Log.d(TAG, "getSong: ${response.code()}")
                }
                _state.value = true // 로딩 끝
            }
        }
    }

    fun getAlbum(keyword: String){
        viewModelScope.launch {
            repository.getAlbum(keyword).let { response ->
                if(response.isSuccessful){
                    var list = response.body()!!.channel!!.itemList
                    if (list != null) {
                        // 결과값 &nbsp; 제거
                        for(i in list){
                            i.album!!.trackList = i.album!!.trackList.replace("&nbsp;"," ").replace("/", "\n")
                                .replace("[Disc 1]","").replace("[Disc 2]","")
                        }
                    }
                    Log.d(TAG, "getAlbum: $list")
                }
            }
        }
    }
}