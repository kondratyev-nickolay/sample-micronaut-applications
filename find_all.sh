main() {
  curl http://localhost:8100/persons | jq
}

main "${@}" || exit 1
