plugins {
    id("com.android.library")
}

apply("../../base-build.gradle")

android {
    namespace = "fastcampus.part5.chapter4.features.detail"
}

dependencies {
    implementation(project(path = ":core"))
}