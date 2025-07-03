<template>
    <div>
        <Number
            label="BookId"
            v-model="value.bookId"
            :editMode="editMode"
        />
        <Number
            label="AuthorId"
            v-model="value.authorId"
            :editMode="editMode"
        />
        <String
            label="AuthorName"
            v-model="value.authorName"
            :editMode="editMode"
        />
        <String
            label="Title"
            v-model="value.title"
            :editMode="editMode"
        />
        <String
            label="ImageUrl"
            v-model="value.imageUrl"
            :editMode="editMode"
        />
        <String
            label="Summary"
            v-model="value.summary"
            :editMode="editMode"
        />
        <String
            label="Context"
            v-model="value.context"
            :editMode="editMode"
        />
        <String
            label="ClassificationType"
            v-model="value.classificationType"
            :editMode="editMode"
        />
        <Date
            label="PublishDate"
            v-model="value.publishDate"
            :editMode="editMode"
        />
        <Number
            label="SelectCount"
            v-model="value.selectCount"
            :editMode="editMode"
        />
        <Number
            label="Rank"
            v-model="value.rank"
            :editMode="editMode"
        />
        <Boolean
            label="Bestseller"
            v-model="value.bestseller"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'LibraryInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "libraryInfos",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
