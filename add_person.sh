main() {
  curl -X POST "http://localhost:8100/persons" \
       -H "Content-Type: application/json" \
       -d '{"id": 0, "firstName": "Alice", "lastName": "Smith", "age": 30, "gender": "FEMALE"}'
}

main "${@}" || exit 1
