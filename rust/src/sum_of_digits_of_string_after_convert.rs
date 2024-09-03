fn get_lucky(s: String, k: i32) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case("iiii", 1, 36)]
    #[case("leetcode", 2, 6)]
    #[case("zbax", 2, 8)]
    fn test_get_lucky(#[case] s: String, #[case] k: i32, #[case] expected: i32) {
        let result = get_lucky(s, k);
        assert_eq!(result, expected);
    }
}
