#![allow(dead_code)]

pub fn construct2_d_array(original: Vec<i32>, m: i32, n: i32) -> Vec<Vec<i32>> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![1,2,3,4], 2, 2, vec![vec![1,2],vec![3,4]])]
    #[case(vec![1,2,3], 1, 3, vec![vec![1,2,3]])]
    #[case(vec![1,2], 1, 1, vec![])]
    fn test_construct2_d_array(
        #[case] original: Vec<i32>,
        #[case] m: i32,
        #[case] n: i32,
        #[case] expected: Vec<Vec<i32>>,
    ) {
        let result = construct2_d_array(original, m, n);
        assert_eq!(result, expected);
    }
}
