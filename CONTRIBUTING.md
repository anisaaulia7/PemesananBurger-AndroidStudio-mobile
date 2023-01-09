# Burger Ordering App Contribution Scheme
After reading or using this Burger Ordering Application, you can contribute to its development. Before starting to contribute, please read the following documents so that you understand the flow of contributions, and this project can be carried out smoothly.

# Contribution
1. Write a *review*
2. Give a feedback, for example if there are application files that don't work
3. Report if there are coding errors.

# Implementation Procedures
You are expected to understand the basic commands and feature functions of Android Studio.

If this is your first time contributing, please take the following steps:
1. Fork the PemesananBurger-AndroidStudio-mobile repository by going to the <a href="https://github.com/anisaaulia7/PemesananBurger-AndroidStudio-mobile">Main Page</a>, then selecting the fork in the upper right corner.
2. Choose your username to fork.
3. Clone the repository that you have forked, by typing `git clone https://github.com/<username Anda>/PemesananBurger-AndroidStudio-mobile.git`
4. Do git remote add upstream `https://github.com/anisaaulia7/PemesananBurger-AndroidStudio-mobile.git`. This command aims to create a remote named upstream that refers to the PemesananBurger-AndroidStudio-mobile repository, so you can pull from the PemesananBurger-AndroidStudio-mobile repository to your forked repository.

After that, you can start working with:
1. Make sure you are on the master branch. You do this by typing the `git status` command and make sure it says `On branch master`. If you are not already on the master branch, type `git checkout master`.
2. Checkout a new branch by typing 1git checkout -b <branch name>`. Use a branch name in English, easy to understand, and related to the issue you want to solve. Example branch name: "addRecursiveExample", "modifyMergeSortMaterial".
3. Make enough changes. You are free to add, commit, or push. But you should not do a merge or pull. This will result in the Git graph structure being less tidy. Instead of merging or pulling, do a rebase or pull --rebase, or nothing.
4. Once you're done, do a `git push origin <branch name>`.
5.Then do a pull request with:
6. Go to the <a href="https://github.com/anisaaulia7/PemesananBurger-AndroidStudio-mobile/pulls">pull request page</a>.
7. Select `New pull request`.
8. Then select the link `compare across forks`.
9. Choose `base fork: anisaaulia7/PemesananBurger-AndroidStudio-mobile`, `base: main`, head fork: <your username>/PemesananBurger-AndroidStudio-mobile, and compare: <name of branch you want to push>.
10. Select `Create pull request`, fill in the title and a brief explanation of what you have done, then select `Create pull request` again.
11. Make sure your push passes the build from Travis CI (if it doesn't, see the error message, fix it, then commit again).
12. Contributors from anisaaulia7 will review the changes you make. If they haven't been agreed, your changes will be reviewed and you can fix them. Once agreed, your contribution will be used and included in the Training Gate materials.
13. You can return to the master branch by typing git checkout master.

If your contribution has been merged with master, you can pull it by typing git pull upstream master to get the changes from the PemesananBurger-AndroidStudio-mobile repository.
  


