// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    // 파이어베이스 사전 설정
    id("com.google.gms.google-services") version "4.4.0" apply false
}