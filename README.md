# NEO S3 Uploader
A utility to upload to NEO's builtin AWS S3

## Usage
Download [neo-s3.jar](https://raw.githubusercontent.com/Boomaa23/neo-aws-s3-upload/master/neo-s3.jar)

`java -jar neo-s3.jar`

The first two arguments must be a valid NEO username and password. The third is a true/false boolean for whether the uploaded file should be registered. May also specify "remove" to remove an uploaded file at that name. All following arguments will be taken as filenames to upload. Files must all be in current directory or specified with relative filename.