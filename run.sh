main() {
  mvn compile exec:exec
}

main "${@}" || exit 1
