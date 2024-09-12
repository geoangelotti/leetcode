fn missing_rolls(rolls: Vec<i32>, mean: i32, n: i32) -> Vec<i32> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![3, 2, 4, 3], 4, 2, vec![6, 6])]
    #[case(vec![1, 5, 6], 3, 4, vec![2, 3, 2, 2])]
    #[case(vec![1, 2, 3, 4], 6, 4, vec![])]
    fn test_missing_rolls(
        #[case] rolls: Vec<i32>,
        #[case] mean: i32,
        #[case] n: i32,
        #[case] expected: Vec<i32>,
    ) {
        let result = missing_rolls(rolls, mean, n);
        assert_eq!(result, expected);
    }
}
