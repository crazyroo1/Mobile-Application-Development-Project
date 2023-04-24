package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

class Dataset {
    val dataset: List<Listable> = listOf<Listable>(
        Folder("Start Here", listOf(
            Folder("Welcome", listOf()),
            Folder("Syllabus", listOf()),
            Folder("Lab Report Instruction", listOf()),
            Folder("Project Instruction", listOf())
        )),
        Folder("Learning Modules", listOf(
            Folder("L1: Course Intro & Kotlin Basics", listOf(
                Link("Course Intro", "https://docs.google.com/presentation/d/1SZS-BRz4T6tZeElBzp8Sdi_Ya-erzHDge9hSrsaouCs/edit#slide=id.gb8813d4be4_1_256"),
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1aStRnrhZv4R6vvY2I8YcrgZ6zA7k7ItPtAHcSWgaO2g/edit#slide=id.gb8cdc7f5e8_0_483"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-1"
                )
            )),
            Folder("L2: Functions", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1Kk-pjfG8NReq6esTjwFrfAhtw6SS2TUFogkgWieYQZw/edit#slide=id.gb88056c3aa_0_416"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-2"
                )
            )),
            Folder("L3: Class and Objects", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1FSZwOeSwL-XNkMXnKDy-YPMEpCPKyb29RlpekSzzJDY/edit#slide=id.gb9961b3fa0_0_433"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-3"
                )
            )),
            Folder("L4: Build your first Android app", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1wu1c9Q_3mcPS1IjazDkci5-8nBJumCfWWY15B9EUjA0/edit#slide=id.gb87ea636ca_0_541"
                ),
                Link(
                    "Sample App: Dice Roller App",
                    "https://github.com/google-developer-training/android-basics-kotlin-create-dice-roller-with-button-app-solution"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-4"
                )
            )),
            Folder("L5: Layouts", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/13pmWTJiISYksgdK0iB4VPEBLUuciupvlD0Cn0Sy-1WI/edit#slide=id.gb87eded92d_0_482"
                ),
                Link(
                    "Sample App: Tip Calculator",
                    "https://github.com/google-developer-training/android-basics-kotlin-tip-calculator-app-solution"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-5"
                )
            )),
            Folder("L6: App Navigation", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1QWLSLfkodgmd3nns8RRNXBCRL45p_0_249lSXiLE2rU/edit#slide=id.gb8b9b28be0_0_397"
                ),
                Link(
                    "Sample App: AndroidTrivia",
                    "https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/AndroidTrivia"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-6"
                )
            )),
            Folder("L7: Activity and Fragment Lifecycle", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1n3OCwb7kRx-y7Q_wYGLtRsDynyDf8e8xOM6_qBn-yY4/edit#slide=id.gb8d2a86dda_0_448"
                ),
                Link(
                    "Sample App: DessertClicker",
                    "https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/DessertClickerLogs"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-7"
                )
            )),
            Folder("L8: App Architecture (UI Layer)", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/10Qpt3z3-DASD-9AmADRBD_7AElM_5cLH4yf2HKgl4YY/edit#slide=id.gb8b649eef8_0_323"
                ),
                Link(
                    "Sample App: Unscramble",
                    "https://github.com/google-developer-training/android-basics-kotlin-unscramble-app/tree/starter"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-8"
                )
            )),
            Folder("L9: App Architecture (Persistence Layer)", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1COEiWNknSmiI5RUgxumLrgscl9d-yvKoj6tjNF9jw5A/edit#slide=id.g796a0b0491_0_404"
                ),
                Link(
                    "Sample App: TrackMySleepQuality",
                    "https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/TrackMySleepQualityFinal"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-9"
                )
            )),
            Folder("L10: Advanced RecyclerView use cases", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1dMK7nkyNhbYDm3dxkwimerww4qWg4UuUT8s8c0GoSL8/edit#slide=id.gafc54c9b39_0_438"
                ),
                Link(
                    "Sample App: RecyclerView",
                    "https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/RecyclerViewHeaders"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-10"
                )
            )),
            Folder("L11: Connect to the Internet", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1osOpeT2U4JnJpSP4YUk7SJ6qAsqxm4FIRw0q6CEvLRo/edit#slide=id.gb8d17af4dc_0_269"
                ),
                Link(
                    "Sample App: MarsRealEstate",
                    "https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/MarsRealEstateFinal"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-11"
                )
            )),
            Folder("L12: Repository Management", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1G_qhNKVzrfuc4y69XUkWpAPB7uDUE1tNtvimKTpGJKM/edit#slide=id.gb4409bc5e2_0_370"
                ),
                Link("WorkManager", "https://github.com/googlecodelabs/android-workmanager/"),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-12"
                )
            )),
            Folder("L13: App UI Design", listOf(
                Link(
                    "Slides",
                    "https://docs.google.com/presentation/d/1ANAfjVvrd8u58QY8_dCmyIc8NUC8AuktfThKMt0R3AI/edit#slide=id.gb9def153d9_0_464"
                ),
                Link(
                    "Shrine",
                    "https://github.com/material-components/material-components-android-codelabs/tree/master/kotlin/shrine"
                ),
                Link(
                    "Lab",
                    "https://developer.android.com/courses/pathways/android-development-with-kotlin-13"
                )
            )),
        ))
    )
}